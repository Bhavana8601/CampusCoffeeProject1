package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;
public class HomePage extends WebTestBase {
    @FindBy(xpath = "//*[@id=\"menu-item-372795\"]/a")
    WebElement OurStoryElement;
    @FindBy(xpath = "//a[text()='Shop']")
    WebElement ShopElement;
    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement LoginElement;
    @FindBy(xpath = "//button[@title='Close']")
    WebElement closedFirstAd;
    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closedSecondAd;
    @FindBy(xpath = "//div[text()='Campos Coffee']")
    WebElement scrolling;
    @FindBy(xpath = "//a[text()='Coffee Of The Month']")
    WebElement CoffeeOfTheMonth;
    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement cafeFinderText;
    @FindBy(xpath = "//a[text()='Brew Guides']")
    WebElement brewGuidesText;
    @FindBy(xpath = "//a[text()='Coffee']")
    WebElement Coffee;
    @FindBy(xpath = "//*[@id=\"carousel-block_6d7d8afd2e4e5e80f93ba1cbec6e7c55\"]/div/div[1]/div[3]/div[2]/div/div/div/a")
    WebElement EveryOrderWinBtn;
    @FindBy(xpath = "//li[@class='user-controls__ul__li user-controls__ul__li--cart']")
    WebElement CartBtn;

    public void closedFirstAd() {DriverUtility.waitUntilElementToBeClickable(closedFirstAd);}
    public void closedSecondAd() {
        DriverUtility.waitUntilElementToBeClickable(closedSecondAd);
    }
    public void clickOnLoginBtn() {
        DriverUtility.waitUntilElementToBeClickable(LoginElement);
    }
    public void MouseHover(){
        DriverUtility.actionsMoveToElement(OurStoryElement);
    }
    public void clickOnCartBtn(){DriverUtility.waitUntilElementToBeClickable(CartBtn);}
    public void MouseHover1(){
        DriverUtility.actionsMoveToElement(ShopElement);
    }
    public void CoffeeText(){DriverUtility.waitUntilElementToBeClickable(Coffee);}
    public void clickCoffeeOfTheMonth(){
        DriverUtility.waitUntilElementToBeClickable(CoffeeOfTheMonth);
    }
    public void clickEveryOrderWinBtn(){DriverUtility.waitUntilElementToBeClickable(EveryOrderWinBtn);}
    public void ScrollingDown(){
        DriverUtility.ScrollDownByVisibleByElement(scrolling);
    }
    public void cafeFinderText(){DriverUtility.isDisplayedElement(cafeFinderText);}
    public void brewGuidesText(){DriverUtility.isSelectedElement(brewGuidesText);}
    public void clickOnBrewGuidesText(){DriverUtility.waitUntilElementToBeClickable(brewGuidesText);}
   public HomePage() {
       PageFactory.initElements(driver, this);
   }
}




