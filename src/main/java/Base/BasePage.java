package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static Constant.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public void open(String url) {
        driver.get(url);
    }
    public WebElement waitElementVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT);
        return element;
//        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
//        return element;
    }
    public void switchTab(String xpathCheck) {
    String oldTab = driver.getWindowHandle();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        driver.findElement(By.xpath(xpathCheck));
    }


}
