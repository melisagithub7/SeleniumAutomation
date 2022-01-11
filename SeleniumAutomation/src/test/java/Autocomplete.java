import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/silim/Desktop/Curs Tester Mely/Selenium/chromedriver.exe");  // Am specificat calea la care sa se gaseasca driverul de Chrome

        WebDriver driver = new ChromeDriver();  // Am declarat o variabila care sa stocheze o instanta a driverului de Chrome
                                                // "driver" este numele variabilei (ales ca si conventie, dar poate sa fie orice nume), iar "WebDriver" este tipul de date al variabilei "driver"
        driver.get("https://formy-project.herokuapp.com/autocomplete");  // Am deschis site-ul pe care vrem sa-l testam
        Thread.sleep(3000); // Ii spunem sistemului sa astepte 3 secunde inainte de urmatoarea actiune
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  // Am declarat o variabila care sa stocheze un element web
                                                                                // "autocomplete" este numele variabilei (ales de catre noi, dar poate sa fie orice), iar "WebElement" este tipul de data al variabilei
        Thread.sleep(3000); // Ii spunem sistemului sa astepte 3 secunde inainte de urmatoarea actiune
        autocomplete.sendKeys("str Lalelelor, nr 54");  // Prin intermediul variabilei "autocomplete" am accesat metoda "sendKeys" pentru a trimite catre browser text scris de la tastatura
        Thread.sleep(3000); // Ii spunem sistemului sa astepte 3 secunde inainte de urmatoarea actiune
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));  // Identificam recomandarile din lista
        Thread.sleep(3000); // Ii spunem sistemului sa astepte 3 secunde inainte de urmatoarea actiune
        autocompleteResult.click();  // Am dat click pe recomandare
        Thread.sleep(3000); // Ii spunem sistemului sa astepte 3 secunde inainte de urmatoarea actiune
        driver.quit(); // Inchidem browserul
    }
}

