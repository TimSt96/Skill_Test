package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static Constant.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver; //экземпляр драйвера
    public BasePage(WebDriver driver){
        this.driver = driver;
    } //конструктор в который передадим webdriver и устанавливаем его в текущую переменную
    public void open(String url) {
        driver.get(url);
    } //метод для открытия страниц Open - в него будет передавать некий url и при вызове мотода Open и в него будет передвавться драйвер getUrl
    public WebElement waitElementVisible(WebElement element){ //метод для ожидания видимости элементов
        new WebDriverWait(driver, EXPLICIT_WAIT); //логика для обработки ожидания загрузки видимости страницы
        return element; //возвращаем полученный элемент
//        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element)); //логика для обработки ожидания загрузки видимости страницы
//        return element; //возвращаем полученный элемент
    }
    public void switchTab(String xpathCheck) {
    String oldTab = driver.getWindowHandle();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        driver.findElement(By.xpath(xpathCheck));
    }


}
