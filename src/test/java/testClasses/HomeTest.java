package testClasses;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CoffeePage;
import pages.HomePage;
import pages.ProductPage;
import testbase.WebTestBase;


public class HomeTest extends WebTestBase {
    public HomePage homePage;
    public ProductPage productPage;
    public CoffeePage coffeePage;
    HomeTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        productPage = new ProductPage();
        coffeePage = new CoffeePage();
    }
    @Test(priority = 1)
    public void VerifyTitle(){
        SoftAssert softAssert = new SoftAssert();
        String expectedPageTitle = "Buy Coffee Online | Speciality Coffee Online | Campos Coffee";
        String actualPageTitle = driver.getTitle();
        System.out.println("Homepage title - " + actualPageTitle);
        softAssert.assertTrue(actualPageTitle.equalsIgnoreCase(expectedPageTitle),"Page title not matched or Problem in loading url page");
        softAssert.assertAll();
    }
    @Test(priority = 3)
    public void VerifyMouseHover() {
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover();
        softAssert.assertAll();
    }
    @Test(priority = 8)
    public void VerifyEveryOrderWinBtn() {
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickEveryOrderWinBtn();
        coffeePage.advertisement();
        String expectedPageTitle ="Buy Coffee Online | Blends, Single Origin, Organic | Campos Coffee";
        String actualPageTitle = driver.getTitle();
        System.out.println("CoffeePage title - " + actualPageTitle);
        softAssert.assertTrue(actualPageTitle.equalsIgnoreCase(expectedPageTitle),"Page title not matched or Problem in loading url page");
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void VerifyHomePageScrollDown(){
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.ScrollingDown();
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public void VerifyShopMouseHover(){
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover1();
        homePage.clickCoffeeOfTheMonth();
        String productPageText = ProductPage.textOfProductPage();
        softAssert.assertEquals(productPageText,"NICARAGUA JESUS MOUNTAIN","Text will be match here");
        softAssert.assertAll();
    }
    @Test(priority = 7)
    public void VerifyShop(){
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover1();
        homePage.CoffeeText();
        softAssert.assertAll();
    }
    @Test(priority = 5)
    public void VerifyIsDisplayedCafeFinderText() {
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.cafeFinderText();
        System.out.println("Cafe Finder Text is present in the homepage");
        softAssert.assertAll();
    }
    @Test(priority = 6)
    public void VerifyIsSelectedBrewGuidesText(){
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.brewGuidesText();
        homePage.clickOnBrewGuidesText();
        System.out.println("Brew Guides Text is present in the homepage and clicked text");
        homePage.ScrollingDown();
        softAssert.assertAll();
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
