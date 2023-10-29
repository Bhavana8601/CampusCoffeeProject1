package utility;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
public class DriverUtility extends WebTestBase {
    public static final long PAGE_LOAD_TIME = 50;
    public static final long IMPLICIT_WAIT = 50;
    public static final long EXPLICIT_WAIT = 50;
    public static WebDriverWait wait;
    public static  Actions actions;
    public static Select select;
    public static JavascriptExecutor javascriptExecutor;

    public static void waitUntilElementToBeClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }
    public static boolean isDisplayedElement(WebElement element){return element.isDisplayed();}
    public static boolean isSelectedElement(WebElement element){return element.isSelected();}
    public static void actionsMoveToElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public static void ScrollDownByVisibleByElement(WebElement element){
        javascriptExecutor  = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static String dropdownSelection(String visibleText,WebElement element){
        select = new Select(element);
        select.selectByVisibleText(visibleText);
        return visibleText;
    }
    public static void dropdownByIndex(int visibleIndex, WebElement element){
        select = new Select(element);
        select.selectByIndex(visibleIndex);
    }
   public static void TakesScreenshot() throws IOException {
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(file,new File(System.getProperty("user.dir") + "/src/main/resources/screenShot/image.PNG"));
    }
}


