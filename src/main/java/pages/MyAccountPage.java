package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//div[text()='Campos Coffee']")
    WebElement ScrollDown;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;
    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmToLogout;

    public void clickOnLogoutBtn() {
        DriverUtility.waitUntilElementToBeClickable(logoutBtn);
    }

    public void confirmToLogoutBtn() {
        DriverUtility.waitUntilElementToBeClickable(confirmToLogout);
    }

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String textOfMyAccount() {
        return DriverUtility.getTextOfElement(myAccountText);
    }

    public void ScrollDownElement() {
        DriverUtility.ScrollDownByVisibleByElement(ScrollDown);
    }

}



