package Base.Skill_Home;

import Base.BasePage;
import Base.StatusCodeCheck;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constant.Constant.EnterParam.*;

public class SkillHomePage extends BasePage { //наследуемся от суперкласса и созд конструктор для инициализации webdriver
    public SkillHomePage(WebDriver driver) {
        super(driver);
    }
    private final By enter_name = By.name("name");
    private final By enter_email = By.name("email");
    private final By enter_email_footer = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[1]/div/input");
    private final By enter_phone = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[3]/div/div[1]/input[1]");
    private final By VK = By.xpath("//a[contains(text(),'VK')]");
    private final By habr = By.xpath("//a[contains(text(),'Хабр')]");
    private final By twitter = By.xpath("//a[contains(text(),'Twitter')]");
    private final By vacancy = By.xpath("//*[contains(@href, 'new.skillfactory.ru/new-job')]");
    private final By chiefEditor = By.xpath("//*[@id=\"rec488529269\"]/div[1]/div/div[3]/div[1]//span");
    private final By vacancyHeadofsales = By.xpath("//*[@id=\"rec488529269\"]/div[1]/div/div/div[2]//a/span");
    private final By events = By.xpath("//*[@id=\"rec298827602\"]//div[21]//a");
    private final By frIntensive = By.xpath("//*[contains(text(),'Ваша первая игра')]");

    private static By innerLinksxPath = By.xpath("//a[contains(@href,'skillfactory.ru/')]");
    public SkillHomePage clickBtn(String xpathBtn) {
        WebElement btnFind = driver.findElement(By.xpath(xpathBtn));
        waitElementVisible(btnFind).click();
        return this;
    }
    //тест 1
    public SkillHomePage enterParamIncorrectName() {
        driver.findElement(enter_name).sendKeys(nameIncorrect);
        return this;
    }
    public SkillHomePage checkIsIncorrectedName() {
        driver.findElement(By.xpath("//p[contains(text(), 'Укажите, пожалуйста, имя')]"));
        return this;
    }
    //тест 2
    public SkillHomePage enterParamIncorrectEmail() {
        driver.findElement(enter_email).sendKeys(emailIncorrect);
        return this;
    }
    public SkillHomePage checkIsIncorrectedEmail() {
        driver.findElement(By.xpath("//p[contains(text(), 'Укажите, пожалуйста, корректный email')]"));
        return this;
    }
    //тест 3
    public SkillHomePage enterParamIncorrectPhone() {
        driver.findElement(enter_name).sendKeys(nameIncorrect);
        driver.findElement(enter_email).sendKeys(emailIncorrect);
        driver.findElement(enter_phone).sendKeys(phoneIncorrect);
        return this;
    }
    public SkillHomePage checkIsIncorrectedPhone() {
        driver.findElement(By.xpath("//p[contains(text(), 'Пожалуйста, заполните все обязательные поля')]"));
        return this;
    }
    //тест 4
    public SkillHomePage enterParamCorrectName() {
        driver.findElement(enter_name).sendKeys(nameCorrect);
        return this;
    }
    public boolean check_is_correctedName() {
        try {
            driver.findElement(By.xpath("//p[contains(text(), 't-input-group t-input-group_nm js-error-control-box')]")).isDisplayed();
            return false;
        } catch (NoSuchElementException exception) {
            return true;
        }
    }
    //тест 5
    public SkillHomePage enterParamCorrectEmail() {
        driver.findElement(enter_email).sendKeys(emailCorrect);
        return this;
    }
    public boolean check_is_correctedEmail() {
        try {
            driver.findElement(By.xpath("//p[contains(text(), 't-input-group t-input-group_em js-error-control-box')]")).isDisplayed();
            return false;
        } catch (NoSuchElementException exception) {
            return true;
        }
    }
    //тест 6
    public SkillHomePage enterParamCorrectPhone() {
        driver.findElement(enter_phone).sendKeys(phoneCorrect);
        driver.findElement(enter_name).sendKeys(nameIncorrect);
        driver.findElement(enter_email).sendKeys(emailCorrect);
        return this;
    }
    public boolean check_is_correctedPhone() {
        try {
            driver.findElement(By.xpath("//p[contains(text(), 'Пожалуйста, заполните все обязательные поля')]")).isDisplayed();
            return false;
        } catch (NoSuchElementException exception) {
            return true;
        }
    }
    //тест 7
    public SkillHomePage GoToLinkVK() {
        driver.findElement(VK).click();
        return this;
    }
    //тест 8
    public SkillHomePage GoToLinkhabr() {
        driver.findElement(habr).click();
        return this;
    }
    //тест 9
    public SkillHomePage GoToLinktwitter() {
        driver.findElement(twitter).click();
        return this;
    }
    //тест 10
    public SkillHomePage findNewsFooterBtn() {
        driver.findElement(enter_email_footer).sendKeys(emailCorrect);
        return this;
    }
    public SkillHomePage isSubscribed() {
        driver.findElement(By.xpath("//*[@id=\"tildaformsuccesspopup\"]/div/div")); //поиск элемента с сообщением о том что данные приняты и нам перезвонят
        return this;
    }
    //тест 11
    public SkillHomePage clickCheckBoxBtnFooter() {
        driver.findElement(enter_email_footer).sendKeys(emailCorrect);
        return this;
    }
    public boolean isNotSubscribed() {
        try {
            driver.findElement(By.xpath("//*[@id=\"tildaformsuccesspopup\"]/div/div")).isDisplayed();
            return false;
        } catch (NoSuchElementException exception) {
            return true;
        }
    }
    //тест 12
    public SkillHomePage CodeChek() {
        StatusCodeCheck.runStatusCodeCheck("https://skillfactory.ru/");
        return this;
    }
    //тест 17
    public SkillHomePage vacancy() {
        driver.findElement(vacancy).click();
        driver.findElement(chiefEditor).click();
       return this;
    }
    //тест 18
    public SkillHomePage vacancy2() {
        driver.findElement(vacancy).click();
        driver.findElement(vacancyHeadofsales).click();
        return this;
    }
//тест 19+20
    public SkillHomePage freeEvents(){
        driver.findElement(events).click();
        driver.findElement(frIntensive).click();
        return this;
    }

}
