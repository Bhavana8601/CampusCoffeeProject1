package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;
import testbase.WebTestBase;

public class ShopTest extends WebTestBase {
    public ShopPage shopPage;
    public HomePage homePage;
    ShopTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        shopPage = new ShopPage();
        homePage = new HomePage();
    }
    @Test
    public void VerifyCartBtn() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnCartBtn();
        shopPage.closedAd();
        shopPage.selectProduct();
        Thread.sleep(4000);
        softAssert.assertAll();
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }


    }
