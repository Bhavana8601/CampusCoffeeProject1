package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;
import java.io.IOException;

public class LogoutPage extends WebTestBase {
    @FindBy(xpath = "//h1[text()='Sorry, you have been blocked']")
    static  
    WebElement Logoutpagetext;
    public LogoutPage(){
        PageFactory.initElements(driver,this);
    }
    public void takesScreenshot() throws IOException {
        DriverUtility.TakesScreenshot();
    }
}
