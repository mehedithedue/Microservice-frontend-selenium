package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Config;
import utils.Login;

import java.util.concurrent.TimeUnit;

public class LoginSuccessfulCheck {

    public static void testLoginSuccessful(WebDriver driver, String loginUrl) {
            driver.get(loginUrl);

            Login.login(driver);

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            String userName =  driver.findElement(By.xpath(Config.HOME.home_username_header_xpath)).getText();

            Assert.assertEquals(userName, Config.LOGIN.username);

    }
}
