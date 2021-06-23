import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import javax.lang.model.element.Element;


public class FirstTest {
    String driverPath = "/Users/syuzannamuradyan/Desktop/chromedriver 2";

    WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

    }

    @Test
    public void myFirstTest() {
        driver.get("https://picsart.com/");

        WebElement element = driver.findElement(By.cssSelector("[data-test='headerNavigation-navigationListItem-Create']"));
        element.click();

        WebElement element1 = driver.findElement(By.cssSelector("p[class=\"sectionText-0-2-720 bottomText-0-2-719 large-0-2-723\"]"));

        String text = element1.getText();


        System.out.println(text);


    }

    @AfterMethod
    public void kill() {
        driver.close();
        driver.quit();
    }

//    @BeforeSuite
//    public void f1(){
//        System.out.println("BeforeSuite");
//    }
//    @BeforeTest
//    public void f2(){
//        System.out.println("BeforeTest");
//    }
//    @BeforeClass
//    public void f3(){
//        System.out.println("BeforeClass");
//    }
//    @BeforeMethod
//    public void f4(){
//        System.out.println("BeforeMethod");
//    }
//    @Test
//    public void f5(){
//        System.out.println("Test");
//    }
//    @AfterMethod
//    public void f6(){
//        System.out.println("AfterMethod");
//    }
//    @AfterClass
//    public void f7(){
//        System.out.println("AfterClass");
//    }
//    @AfterTest
//    public void f8(){
//        System.out.println("AfterTest");
//    }
//    @AfterSuite
//    public void f9(){
//        System.out.println("AfterSuite ");
//    }

}
