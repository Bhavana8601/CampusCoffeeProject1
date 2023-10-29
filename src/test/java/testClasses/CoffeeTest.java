package testClasses;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CoffeePage;
import pages.HomePage;
import testbase.WebTestBase;

public class CoffeeTest extends WebTestBase {
    public HomePage homePage;
    public CoffeePage coffeePage;
    CoffeeTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        coffeePage = new CoffeePage();
    }
    @Test
    public void VerifySelectDropdown(){
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover1();
        homePage.CoffeeText();
        coffeePage.advertisement();
        coffeePage.dropdown();
        softAssert.assertAll();
    }

    @Test
    public void VerifyFilterBtn(){
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover1();
        homePage.CoffeeText();
        coffeePage.advertisement();
        coffeePage.filter();
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
