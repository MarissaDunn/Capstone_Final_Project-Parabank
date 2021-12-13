import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsMethods {
    private static WebDriver driver = Base.getDriver();

//transfer money from one account to another owned account.
    public static void transfer_money() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/p/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[3]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input")).click();

    }
}