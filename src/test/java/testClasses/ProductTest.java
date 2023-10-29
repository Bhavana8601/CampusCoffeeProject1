package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductPage;
import testbase.WebTestBase;

public class ProductTest extends WebTestBase {
    public ProductPage productPage;
    public HomePage homePage;

    ProductTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        productPage = new ProductPage();
        homePage = new HomePage();
    }

    @Test
    public void VerifyDropdownSelect() {
         SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.MouseHover1();
        homePage.clickCoffeeOfTheMonth();
        productPage.closedAdvertisement();
        productPage.scroll();
        productPage.dropdownByIndex();
        System.out.println("Product Weight Will Be Selected");
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }
}
