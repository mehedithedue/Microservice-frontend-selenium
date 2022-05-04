package runner;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class Setup {

    private static WebDriver driver;

    private Setup() {

    }

    private static WebDriver invokeBrowser() {
        WebDriver driver = DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;
    }


    public static WebDriver getWebdriverInstance() {
        if (driver == null) {
            driver = invokeBrowser();
        }
        return driver;
    }
}
