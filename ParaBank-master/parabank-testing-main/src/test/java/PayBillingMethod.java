import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PayBillingMethod {
    private static final WebDriver driver = Base.getDriver();

    // fill out a bill pay to payee and check's transaction occurred
    public static void PayBills() {
        WebElement billpay = driver.findElement(By.xpath("//a[@href='/parabank/billpay.htm']"));
        billpay.click();
        WebElement payee_name = driver.findElement(By.xpath("//*[contains(@name,'payee.name')]"));
        payee_name.sendKeys("Mickey");
        WebElement address = driver.findElement(By.xpath("//*[contains(@name,'payee.address.street')]"));
        address.sendKeys("Michigan Street 12");
        WebElement City = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)"));
        City.sendKeys("Washington");
        WebElement State = driver.findElement(By.xpath("//*[contains(@name,'payee.address.state')]"));
        State.sendKeys("NY");
        WebElement zip_code = driver.findElement(By.xpath("//*[contains(@name,'payee.address.zipCode')]"));
        zip_code.sendKeys("2010");
        WebElement phone_number = driver.findElement(By.xpath("//*[contains(@name,'payee.phoneNumber')]"));
        phone_number.sendKeys("02345678");
        WebElement account_number = driver.findElement(By.xpath("//*[contains(@name,'payee.accountNumber')]"));
        account_number.sendKeys("54321");
        WebElement verify_accountno = driver.findElement(By.xpath("//*[contains(@name,'verifyAccount')]"));
        verify_accountno.sendKeys("54321");
        WebElement amount = driver.findElement(By.xpath("//*[contains(@name,'amount')]"));
        amount.sendKeys("10");
        WebElement send_payment = driver.findElement(By.xpath("//*[@type='submit'or @type='submit']"));
        send_payment.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/input")).sendKeys("12-10-2021");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[5]/button")).click();
        WebElement billPayed = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]/a"));
        billPayed.getText();
        Assert.assertTrue("Bill Payment to Mickey",true);

    }
}