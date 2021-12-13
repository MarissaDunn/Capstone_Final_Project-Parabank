import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterMethod {
    private static WebDriver driver= Base.getDriver();



// registers new users account information
    public static void register() {
     WebElement logOut = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a"));
     logOut.click();

       WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a"))).click();
        WebElement firstname= driver.findElement(By.xpath("//*[contains(@id,'customer.firstName')]"));
        firstname.sendKeys("Thomas");
        WebElement lastname= driver.findElement(By.xpath("//*[contains(@id,'customer.lastName')]"));
        lastname.sendKeys("Braddison");
        WebElement address = driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
        address.sendKeys("123 ft ln");
        WebElement City = driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
        City.sendKeys("hut");
        WebElement State = driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
        State.sendKeys("NC");
        WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
        ZipCode.sendKeys("28375");
        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]"));
        PhoneNumber.sendKeys("3208675309");
        WebElement SSN= driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]"));
        SSN.sendKeys("123456789");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"customer.username\"]"));
        username.sendKeys("chocolate");
         WebElement password = driver.findElement(By.xpath("//*[@id=\"customer.password\"]"));
         password.sendKeys("123");
          WebElement password_repeat = driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]"));
          password_repeat.sendKeys("123");
          WebElement register_button = driver.findElement(By.xpath("//input[@class='button' and @value='Register']"));
          register_button.click();
    }
}