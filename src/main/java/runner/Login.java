package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testcases.LoginSuccessfulCheck;
import utils.Config;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver = null;

    @Test
    public void invokeBrowser() {
        driver = DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test(dependsOnMethods = "invokeBrowser")
    public void loginTest() {
		driver.get(Config.URLS.demosite_url);
        LoginSuccessfulCheck.testLoginSuccessful(driver, Config.URLS.login_url);
        driver.close();
    }
}
