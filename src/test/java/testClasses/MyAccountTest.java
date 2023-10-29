package testClasses;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

import java.io.File;

public class MyAccountTest extends WebTestBase {
    public MyAccountPage myAccountPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    MyAccountTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        logoutPage = new LogoutPage();
    }
    @Test
    public void VerifyScrollDown(){
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountPageText = myAccountPage.textOfMyAccount();
        softAssert.assertEquals(myAccountPageText,"MY ACCOUNT","Text will be match here");
        myAccountPage.ScrollDownElement();
        softAssert.assertAll();
    }
    @Test
        public void VerifyLogoutBtn() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.clickOnLogoutBtn();
        myAccountPage.confirmToLogoutBtn();
        Thread.sleep(3000);
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
