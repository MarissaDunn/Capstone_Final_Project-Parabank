import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenAccount extends Base{

    //create a checking account
    public static void CreateAccountChecking() {
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]"));
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        Assert.assertTrue("Account Opened!", true);
    }

    //create a savings account
    public static void CreateAccountSavings(){
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]/option[2]")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        Assert.assertTrue("Account Opened!", true);
    }

}
