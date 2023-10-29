package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;
public class CoffeePage extends WebTestBase {
    @FindBy(id="sort")
    WebElement sortDropdown;
    @FindBy(xpath = "//a[@class='filter-bar__inner__section__trigger filter__trigger button button--secondary']")
    WebElement filter;
    @FindBy(xpath = "//*[@id=\"body\"]/header/div/nav/nav/ul/li[4]/div/a")
    WebElement advertisement;
    @FindBy(xpath = "//title[text()='Buy Coffee Online | Blends, Single Origin, Organic | Campos Coffee']")
    static
    WebElement coffeePageText;
    public CoffeePage(){
        PageFactory.initElements(driver, this);
    }
    public void advertisement(){
        DriverUtility.waitUntilElementToBeClickable(advertisement);
    }
    public void filter(){DriverUtility.waitUntilElementToBeClickable(filter);}
    public void dropdown(){
        DriverUtility.dropdownSelection("Latest",sortDropdown);
    }
}
