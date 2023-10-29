package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class ProductPage extends WebTestBase {
    @FindBy(xpath = "//h1[text()='Nicaragua Jesus Mountain']")
    static
    WebElement productText;
   /*@FindBy(xpath = "//option[text()='Please select']")
    WebElement selected;
    @FindBy(xpath = "//option[text()='250g']")
    WebElement bagSize;*/
    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement WeightSelect;
    @FindBy(xpath = "//*[@id=\"body\"]/header/div/nav/nav/ul/li[4]/div/a")
    WebElement closedAdvertisement;
    @FindBy(xpath = "//div[text()='Frequency']")
    WebElement scrollingPage;
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    public void scroll(){
        DriverUtility.ScrollDownByVisibleByElement(scrollingPage);
    }
    public void closedAdvertisement(){
        DriverUtility.waitUntilElementToBeClickable(closedAdvertisement);
    }
    public static String textOfProductPage() {
        return DriverUtility.getTextOfElement(productText);
    }
    public void dropdownByIndex() {
        DriverUtility.dropdownByIndex(1,WeightSelect);
    }
}

