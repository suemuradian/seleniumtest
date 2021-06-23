import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstHomework {
        String driverPath = "/Users/syuzannamuradyan/Desktop/chromedriver 2";

        WebDriver driver;

        @BeforeMethod
        public void initDriver() {
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();

        }

        @Test
        public void homeWork1() {
            driver.get("https://picsart.com/");

            WebElement element = driver.findElement(By.cssSelector("[data-test='headerNavigation-navigationListItem-Pricing']"));
            element.click();

            WebElement element1 = driver.findElement(By.cssSelector(".gold-pricing-title"));

            String text = element1.getText();

            System.out.println(text.equals("Try PicsArt Gold Free for 7-Days"));


        }

        @AfterMethod
        public void kill() {
            driver.close();
            driver.quit();
        }
}
