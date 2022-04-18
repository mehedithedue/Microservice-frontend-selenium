package testcases;

import org.openqa.selenium.WebDriver;
import utils.Config;
import utils.Login;

public class LoginSuccessfulCheck {

    public static void testLoginSuccessful(WebDriver driver, String url) {
        loginSuccessfully(driver, url);
    }

    public static void loginSuccessfully(WebDriver driver, String url) {
        try {
            driver.get(url);

            Login.login(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
