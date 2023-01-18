package Tests.base;

import Base.BasePage;
import Base.Skill_Home.OnlineCourses;
import Base.Skill_Home.SkillHomePage;
import Common.CommonActions;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class baseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SkillHomePage skillHomePage = new SkillHomePage(driver);
    protected OnlineCourses onlineCourses = new OnlineCourses(driver);
    public static final Boolean HOLD_BROWSER_OPEN = true;

    @After()
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
