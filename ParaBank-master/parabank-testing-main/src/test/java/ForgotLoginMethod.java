import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotLoginMethod {
    private static WebDriver driver= Base.getDriver();

    //attempting to obtain forgotten login.
    public static void forgotLogin(){
        WebElement logOut = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a"));
        logOut.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Thomas");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Braddison");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("123 ft ln");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("hut");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("NC");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("28375");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("3208675309");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();
    }

}