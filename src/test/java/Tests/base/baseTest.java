package Tests.base;

import Base.BasePage;
import Base.Skill_Home.OnlineCourses;
import Base.Skill_Home.SkillHomePage;
import Common.CommonActions;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class baseTest { //тут будут общие параметры и методы для всех тестовых классов и все тестовые классы будут наследоваться от этого BaseTest класса
    protected WebDriver driver = CommonActions.createDriver(); //модификатор protected - для того чтобы его прокидывать в другие классы. Обращаемся к методу createdriver класса CommonActions
    protected BasePage basePage = new BasePage(driver); //создаем экземпляр класса наших страниц
    protected SkillHomePage skillHomePage = new SkillHomePage(driver);//созд домашнюю страницу.
    protected OnlineCourses onlineCourses = new OnlineCourses(driver);
    public static final Boolean HOLD_BROWSER_OPEN = true;

    @After()
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
