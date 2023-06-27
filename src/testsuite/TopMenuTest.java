package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the computer tab
        driver.findElement(By.xpath("//a[@href='Computers ']")).click();
        //Verify the text ‘Computers’

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("")).click();
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("")).click();

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("")).click();
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("")).click();
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Click on the Gift cards
        driver.findElement(By.xpath("")).click();
    }
}
