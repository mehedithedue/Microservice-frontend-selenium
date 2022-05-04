package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Config;
import utils.HeaderUtils;
import utils.ProductModuleUtils;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ProductModuleCheck {

    public static void productLinkClickableCorrectly(WebDriver driver) {
        driver.get(Config.URLS.demosite_url);
        driver.findElement(By.id(HeaderUtils.LOCATOR.dropdown_menu_id)).click();
        driver.findElement(By.linkText(HeaderUtils.TEXT.product_menu_text)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(HeaderUtils.LOCATOR.header_xpath)).getText(), ProductModuleUtils.TEXT.header_title);
    }
    public static void productPageRenderCorrectly(WebDriver driver) {

        assertEquals(driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.table_row_product_name)).getText(), ProductModuleUtils.TEXT.test_product_name);
    }

    public static void productFirstNameUpdateCorrectly(WebDriver driver) {

        driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.table_first_row_edit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement productFirstNameField = driver.findElement(By.id(ProductModuleUtils.LOCATOR.product_edit_name_id));

        assertEquals(productFirstNameField.getAttribute("value"), ProductModuleUtils.TEXT.test_product_name);

        productFirstNameField.click();

        productFirstNameField.clear();

        productFirstNameField.sendKeys(ProductModuleUtils.TEXT.test_product_name_change);

        driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.product_edit_form_submit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.table_row_product_name)).getText(), ProductModuleUtils.TEXT.test_product_name_change);
    }


    public static void productFirstNameRollbackCorrectly(WebDriver driver) {

        driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.table_first_row_edit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement productFirstNameField = driver.findElement(By.id(ProductModuleUtils.LOCATOR.product_edit_name_id));

        assertEquals(productFirstNameField.getAttribute("value"), ProductModuleUtils.TEXT.test_product_name_change);

        productFirstNameField.click();

        productFirstNameField.clear();

        productFirstNameField.sendKeys(ProductModuleUtils.TEXT.test_product_name);

        driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.product_edit_form_submit_button)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(ProductModuleUtils.LOCATOR.table_row_product_name)).getText(), ProductModuleUtils.TEXT.test_product_name);
    }
}
