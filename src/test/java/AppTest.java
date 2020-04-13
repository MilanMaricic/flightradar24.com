import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.WeakHashMap;

public class AppTest {
    public String siteURL = "https://www.flightradar24.com/45.25,19.84/8";
    private String projectLocation = System.getProperty("user.dir");
    ;

    @Test
    public void loadPageTest() {
        //String projectLocation = System.getProperty("user.dir");
        //configure WebDriver which will be used for test execution
        System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver = new FirefoxDriver();

        //commands that will execute test
        driver.get(siteURL);
        Assert.assertEquals(driver.getTitle(), "Flightradar24: Live Flight Tracker - Real-Time Flight Tracker Map");
        driver.quit();
    }
}