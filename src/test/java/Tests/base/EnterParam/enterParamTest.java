package Tests.base.EnterParam;

import Tests.base.baseTest;
import org.junit.Test;
import org.openqa.selenium.By;

import static Constant.Constant.Urls.ONLINE_COURSES;
import static Constant.Constant.Urls.SKILL_HOME_PAGE;

public class enterParamTest extends baseTest {

   //1 тестирование поля name на некорректное значение
    @Test
    public void IncorrectName() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamIncorrectName()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .checkIsIncorrectedName();
    }
    //2 тестирование поля email на некорректное значение
    @Test
    public void IncorrectEmail() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamIncorrectEmail()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .checkIsIncorrectedEmail();
    }
    //3 тестирование поля phone на некорректное значение
    @Test
    public void IncorrectPhone() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamIncorrectPhone()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .checkIsIncorrectedPhone();
    }
    //4 тестирование поля name на корректное значение
    @Test
    public void CorrectName() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamCorrectName()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .check_is_correctedName();
    }
    //5 тестирование поля email на корректное значение
    @Test
    public void CorrectEmail() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamCorrectEmail()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .check_is_correctedEmail();
    }
    //6 тестирование поля phone на корректное значение
    @Test
    public void CorrectPhone() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.enterParamCorrectPhone()
                .clickBtn("//*[@id=\"form456746058\"]/div[2]/div[5]/button")
                .check_is_correctedPhone();
    }
    //7 переход по ссылкам соцсетей VK
    @Test
    public void GoToVK() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.GoToLinkVK();
        basePage.switchTab("//*[contains(@href,'vk.com')]");
    }
    //8 переход по ссылкам соцсетей habr
    @Test
    public void GoToHabr() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.GoToLinkhabr();
        basePage.switchTab("//*[contains(@href,'habr.com')]");
    }
    //9 переход по ссылкам соцсетей twitter (VPN)
    @Test
    public void GoToTwitter() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.GoToLinktwitter();
        basePage.switchTab("//*[@id=\"react-root\"]//h1/a/div");
    }
    //10 кнопка подписаться в футере позитивное тестирование
    @Test
    public void NewsSubscription() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.findNewsFooterBtn()
                .clickBtn("//*[@id=\"form298827602\"]/div[2]/div[4]/button")
                .isSubscribed();
    }
    //11 кнопка подписаться в футере негативное тестирование (без галочки соглашения)
    @Test
    public void NewsSubscriptionOffCheckBox() {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.clickCheckBoxBtnFooter()
                .clickBtn("//*[@id=\"form298827602\"]/div[2]/div[2]/div/label/div")
                .clickBtn("//*[@id=\"form298827602\"]/div[2]/div[4]/button")
                .isNotSubscribed();
    }
    //12 проверка статус кодов всех переходов с www.skillfactory.ru
    @Test
    public void Links() {
        skillHomePage.CodeChek();
    }
    //13 тестирование переходов по ссылкам "Онлайн Курсы" с контролем в новых вкладках в одном окне браузера "Data Scientist"
    @Test
    public void dataScientistPro() {
        basePage.open(ONLINE_COURSES);
        onlineCourses.dataScientist();
        basePage.switchTab("//*[@id=\"rec451447015\"]//div[6]");
    }
    //14 тестирование переходов по ссылкам "Онлайн Курсы" с контролем в новых вкладках в одном окне браузера "Junior-аналитик с нуля за 6 недель"
    @Test
    public void bootcampAnalytics () {
        basePage.open(ONLINE_COURSES);
        onlineCourses.Analytics();
        basePage.switchTab("//*[@id=\"rec512480830\"]/div/div/div[3]/div");
    }
    //15 тестирование переходов по ссылкам "Онлайн Курсы" с контролем в новых вкладках в одном окне браузера "IT-специалист с нуля"
    @Test
    public void itSpecialistFrom0() {
        basePage.open(ONLINE_COURSES);
        onlineCourses.itSpecialist();
        basePage.switchTab("//*[contains(text(),'IT-специалист с нуля')]");
    }
    //16 тестирование переходов по ссылкам "Онлайн Курсы" с контролем в новых вкладках в одном окне браузера "Fullstack
    //веб-разработчик"
    @Test
    public void fullstackWebDeveloper() {
        basePage.open(ONLINE_COURSES);
        onlineCourses.WebDeveloper();
        basePage.switchTab("//*[text()='Fullstack веб-разработчик']");
    }
    //17 тестирование переходов по ссылкам "Вакансии" с контролем в новых вкладках в одном окне браузера "Шеф-редактор"
    @Test
    public void vacancyChiefEditor () {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.vacancy();
        basePage.switchTab("//*//h1/span");
    }
    //18 тестирование переходов по ссылкам "Вакансии" с контролем в новых вкладках в одном окне браузера "Head of Sales"
    @Test
    public void vacancyHeadofsales () {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.vacancy2();
        basePage.switchTab("//*//h1/span");
    }
    //19 тестирование поля email в разделе "Бесплатные мероприятия и материалы" на некорректное значение
    @Test
    public void freeEventsIntensiveIncorrect () {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.freeEvents();
        basePage.switchTab("//*[@id=\"form524556420\"]//input[@name='email']");
        skillHomePage.enterParamIncorrectEmail();
        skillHomePage.clickBtn("//*[@id=\"form524556420\"]//button");
        driver.findElement(By.xpath("//p[contains(text(), 'корректный')]"));
    }
    //20 тестирование поля email в разделе "Бесплатные мероприятия и материалы" на отсутствующее значение
    @Test
    public void freeEventsIntensiveEmpty () {
        basePage.open(SKILL_HOME_PAGE);
        skillHomePage.freeEvents();
        basePage.switchTab("//*[@id=\"form524556420\"]//input[@name='email']");
        skillHomePage.clickBtn("//*[@id=\"form524556420\"]//button");
        driver.findElements(By.xpath("//*[(contains(@style,'opacity: 1'))]"));
    }
}