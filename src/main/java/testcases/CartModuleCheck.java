package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CartModuleUtils;
import utils.Config;
import utils.HeaderUtils;
import utils.ProductModuleUtils;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class CartModuleCheck {

    public static void clickFirstProductOnLatestProduct(WebDriver driver) {

        driver.get(Config.URLS.demosite_url);

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.findElement(By.xpath(CartModuleUtils.LOCATOR.first_product_xpath)).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals(driver.findElement(By.xpath(CartModuleUtils.LOCATOR.add_to_cart_button)).getText(), CartModuleUtils.TEXT.cart_button_name);
    }

    public static void clickAddToCartAndCheckOnCartPage(WebDriver driver) {

        String bookName = driver.findElement(By.xpath(CartModuleUtils.LOCATOR.details_page_book_name)).getText();

        driver.findElement(By.xpath(CartModuleUtils.LOCATOR.add_to_cart_button)).click();

        driver.findElement(By.xpath(HeaderUtils.LOCATOR.cart_page_link)).click();

        assertEquals(driver.findElement(By.xpath(HeaderUtils.LOCATOR.header_xpath)).getText(), CartModuleUtils.TEXT.header_title);

        assertEquals(driver.findElement(By.xpath(CartModuleUtils.LOCATOR.cart_page_first_book_name)).getText(), bookName);
    }

}
