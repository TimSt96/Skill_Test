package Base.Skill_Home;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineCourses extends BasePage {

    public OnlineCourses(WebDriver driver) {
        super(driver);
    }

    private final By DataSciencePage = By.xpath("//*[@id=\"rec520657663\"]//div[1]/a");
    private final By DataSciencePage2 = By.xpath("//*//div[26]/a");
    private final By bootcampAnalyticsPage = By.xpath("//*[@id=\"rec520657663\"]//div[17]/a");
    private final By bootcampAnalyticsPage2 = By.xpath("//*[@id=\"rec525315534\"]//div[3]/a");
    private final By programmirovaniePage = By.xpath("//*[@id=\"rec520657663\"]//div[3]/a");
    private final By itSpecialistfrom0Page2 = By.xpath("//*//div[41]/a");
    private final By webRazrabotkaPage = By.xpath("//*[@id=\"rec520657663\"]//*[contains(text(),'Веб-разработка')]");
    private final By fullstackPage2 = By.xpath("//*//div[46]/a");

    //тест 13
    public OnlineCourses dataScientist() {
        driver.findElement(DataSciencePage).click();
        driver.findElement(DataSciencePage2).click();
        return this;
    }

    //тест 14
    public OnlineCourses Analytics() {
        driver.findElement(bootcampAnalyticsPage).click();
        driver.findElement(bootcampAnalyticsPage2).click();
        return this;
    }
    //тест 15
    public OnlineCourses itSpecialist() {
        driver.findElement(programmirovaniePage).click();
        driver.findElement(itSpecialistfrom0Page2).click();
        return this;
    }
    //тест 16
    public OnlineCourses WebDeveloper() {
        driver.findElement(webRazrabotkaPage).click();
        driver.findElement(fullstackPage2).click();
        return this;
    }
}

