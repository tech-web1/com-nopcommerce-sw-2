package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";

    @Before
    public void setup(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        driver.findElement(By.linkText("Login")).click();
        String expectedWelcomeText="Welcome,please sign In!";
        String actualWelcomeText=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        Assert.assertEquals("Welcome message is not displayed",expectedWelcomeText,actualWelcomeText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
      //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter valid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prime123@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Test123");
        //Click on Login Button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //Verify the ‘Log out’ text is display
        String expectedMessage="Log out text is display";
        String actualMessage=driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        //Assert.assertEquals("Logout button is displayed",expectedMessage,actualMessage);




    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the Login link
        driver.findElement(By.linkText("Log in")).click();
        //Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qwer@yahoo.com");
        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("qwerty");
        //Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //Verify the error message ‘Login was unsuccessful.Please correct the errors and try again. No customer account found
        String expectedMessage ="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message is not displayed",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
