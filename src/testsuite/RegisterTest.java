package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register Icon
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Select on Gender button
        driver.findElement(By.id("gender-female")).click();
        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Niyati");
        //Enter the Lastname
        driver.findElement(By.name("LastName")).sendKeys("Parekh");
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("11");
        //Enter the Email
        driver.findElement(By.id("Email")).sendKeys("jaitra@gmail.com");
        //Enter password
        driver.findElement(By.id("Password")).sendKeys("123456");
        //Enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        //Click on Register
        driver.findElement(By.id("register-button")).click();
        //Verify your registration completed message
        String expectedMessage="Your registration completed";
        String actualMessage=driver.findElement(By.className("result")).getText();
        Assert.assertEquals("Registration completed message is not displayed",expectedMessage,actualMessage);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
