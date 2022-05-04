package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static void login(WebDriver driver) {

        driver.findElement(By.id(Config.LOGIN.username_field_id)).clear();
        driver.findElement(By.id(Config.LOGIN.password_field_id)).clear();

        driver.findElement(By.id(Config.LOGIN.username_field_id)).sendKeys(Config.LOGIN.username);
        driver.findElement(By.id(Config.LOGIN.password_field_id)).sendKeys(Config.LOGIN.password);

        driver.findElement(By.xpath(Config.LOGIN.login_button_xpath)).click();
    }

    public static void login(WebDriver driver, String username, String password) {
        driver.findElement(By.id(Config.LOGIN.username_field_id)).clear();
        driver.findElement(By.id(Config.LOGIN.password_field_id)).clear();

        driver.findElement(By.id(Config.LOGIN.username_field_id)).sendKeys(username);
        driver.findElement(By.id(Config.LOGIN.password_field_id)).sendKeys(password);
        driver.findElement(By.xpath(Config.LOGIN.login_button_xpath)).click();
    }

    public static void logout(WebDriver driver) {
        Actions cursor = new Actions(driver);
        WebElement admin_bar_account = driver.findElement(By.id("wp-admin-bar-my-account"));
        WebElement admin_bar_menu_logout = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a"));
        cursor.moveToElement(admin_bar_account).moveToElement(admin_bar_menu_logout).click().build().perform();
    }
}