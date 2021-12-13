import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FalseLoginMethod {
    private static WebDriver driver = Base.getDriver();

    // attempts to login with incorrect credentials.
    public static void falseLogin() {

        WebElement logOut = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a"));
        logOut.click();

        WebElement username = driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(2) > input"));
        username.sendKeys("lala");
        WebElement password = driver.findElement(By.xpath("//input[@class='input' and @name='password']"));
        password.sendKeys("lala");
        WebElement submit_button = driver.findElement(By.cssSelector("input.button"));
        submit_button.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p")).getText();
        Assert.assertTrue("The username and password could not be verified.", true);
    }
}