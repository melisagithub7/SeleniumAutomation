import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_cssSelector {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:/Users/silim/Desktop/Curs Tester Mely/Selenium/chromedriver.exe");  // Am specificat calea la care sa se gaseasca driverul de Chrome
            WebDriver driverChrome = new ChromeDriver();
            driverChrome.get("https://formy-project.herokuapp.com/checkbox");
            Thread.sleep(3000);
            driverChrome.findElement(By.id("checkbox-1")).click();
            Thread.sleep(3000);
            WebElement checkbox2 = driverChrome.findElement(By.cssSelector("#checkbox-2"));
            checkbox2.click();
            Thread.sleep(3000);
            WebElement checkbox3 = driverChrome.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
            checkbox3.click();
            Thread.sleep(3000);
            driverChrome.quit();

        }

    }
