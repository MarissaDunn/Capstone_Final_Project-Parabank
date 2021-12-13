import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {
    private static WebDriver driver;

    //class is used for the chrome driver, and getting to the para bank site
    @BeforeMethod
    public static WebDriver getDriver() {

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/index.htm");


            WebElement username = driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(2) > input"));
            username.sendKeys("chocolate");
            WebElement password = driver.findElement(By.xpath("//input[@class='input' and @name='password']"));
            password.sendKeys("123");
            WebElement submit_button = driver.findElement(By.cssSelector("input.button"));
            submit_button.click();
        return driver;
    }
    @AfterMethod
    public static void tearDown(){
        System.out.println("tear down");
        driver.quit();
    }

}













