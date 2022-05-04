package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Config;
import utils.HeaderUtils;
import utils.UserListUtils;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class UserListAccessCheck {

    public static void userlinkClickbleCorrectly(WebDriver driver) {
        driver.get(Config.URLS.demosite_url);
        driver.findElement(By.id(HeaderUtils.LOCATOR.dropdown_menu_id)).click();
        driver.findElement(By.linkText(HeaderUtils.TEXT.user_menu_text)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(UserListUtils.LOCATOR.header_xpath)).getText(), UserListUtils.TEXT.header_title);
    }
    public static void userPageRenderCorrectly(WebDriver driver) {

        SoftAssert softassert = new SoftAssert();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        softassert.assertEquals(driver.findElement(By.xpath(UserListUtils.LOCATOR.table_first_row_username)).getText(), UserListUtils.TEXT.test_user_name);
    }

    public static void userFirstNameUpdateCorrectly(WebDriver driver) {

        driver.findElement(By.xpath(UserListUtils.LOCATOR.table_first_row_edit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement userFirstNameField = driver.findElement(By.id(UserListUtils.LOCATOR.user_edit_firstname_id));

        assertEquals(userFirstNameField.getAttribute("value"), UserListUtils.TEXT.test_user_first_name);

        userFirstNameField.click();

        userFirstNameField.clear();

        userFirstNameField.sendKeys(UserListUtils.TEXT.test_user_first_name_change);

        driver.findElement(By.xpath(UserListUtils.LOCATOR.user_edit_form_submit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(UserListUtils.LOCATOR.table_first_row_first_name)).getText(), UserListUtils.TEXT.test_user_first_name_change);
    }


    public static void userFirstNameRollbackCorrectly(WebDriver driver) {

        driver.findElement(By.xpath(UserListUtils.LOCATOR.table_first_row_edit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement userFirstNameField = driver.findElement(By.id(UserListUtils.LOCATOR.user_edit_firstname_id));

        assertEquals(userFirstNameField.getAttribute("value"), UserListUtils.TEXT.test_user_first_name_change);

        userFirstNameField.click();

        userFirstNameField.clear();

        userFirstNameField.sendKeys(UserListUtils.TEXT.test_user_first_name);

        driver.findElement(By.xpath(UserListUtils.LOCATOR.user_edit_form_submit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(UserListUtils.LOCATOR.table_first_row_first_name)).getText(), UserListUtils.TEXT.test_user_first_name);
    }
}
