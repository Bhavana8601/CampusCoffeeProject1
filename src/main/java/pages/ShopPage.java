package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class ShopPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Dark City']")
    WebElement productShop;

    @FindBy(xpath = "//*[@id=\"body\"]/header/div/nav/nav/ul/li[4]/div/a")
    WebElement Ad;
    public ShopPage() {
        PageFactory.initElements(driver, this);
    }
    public void selectProduct(){
        DriverUtility.waitUntilElementToBeClickable(productShop);
    }
    public void closedAd(){
        DriverUtility.waitUntilElementToBeClickable(Ad);
    }

}
