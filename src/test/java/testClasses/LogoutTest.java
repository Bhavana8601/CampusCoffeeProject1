package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

import java.io.IOException;

public class LogoutTest extends WebTestBase {
    public MyAccountPage myAccountPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    LogoutTest(){
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
    public void screenshotVerify() throws IOException{
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.clickOnLogoutBtn();
        myAccountPage.confirmToLogoutBtn();
        logoutPage.takesScreenshot();
        softAssert.assertAll();
    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
