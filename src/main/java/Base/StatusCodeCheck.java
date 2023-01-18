package Base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import Common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Constant.Constant;

public class StatusCodeCheck {
    protected WebDriver driver; //экземпляр драйвера

    public StatusCodeCheck(WebDriver driver) {
        this.driver = driver;
    }
    private static final By PageToStatusCheck = By.xpath("//a[contains(@href,'skillfactory.ru/')]");
    public static void runStatusCodeCheck(String URL) {
        WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL);
        List<WebElement> Links = driver.findElements(PageToStatusCheck);
        linkChecker(Links);
    }
    public static void linkChecker(List<WebElement> links) {
        String url;
        int respCode;
        Iterator<WebElement> it = links.iterator();
        while (it.hasNext()) {
            url = (it.next()).getAttribute("href");
            try {
                HttpURLConnection huc = (HttpURLConnection) (new URL(url)).openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                int numberOfBrokenLinks = 0;
                if (respCode >= 400) {
                    System.out.println(url + " is a broken link" + " status code is " + respCode);
                    ++numberOfBrokenLinks;
                } else {
                    System.out.println(url + " status code is " + respCode);
                }
                Assert.assertEquals(numberOfBrokenLinks, 0);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



