import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runner.Setup;
import testcases.CartModuleCheck;
import testcases.LoginSuccessfulCheck;
import testcases.ProductModuleCheck;
import testcases.UserListAccessCheck;
import utils.Config;

public class Main {

    WebDriver driver = null;

    @Test
    public void loginTest() {
        driver = Setup.getWebdriverInstance();
        LoginSuccessfulCheck.testLoginSuccessful(driver, Config.URLS.login_url);
    }

    @Test(dependsOnMethods = "loginTest")
    public void userListTest() {
        driver = Setup.getWebdriverInstance();
        UserListAccessCheck.userlinkClickbleCorrectly(driver);
        UserListAccessCheck.userPageRenderCorrectly(driver);
        UserListAccessCheck.userFirstNameUpdateCorrectly(driver);
        UserListAccessCheck.userFirstNameRollbackCorrectly(driver);
    }

    @Test(dependsOnMethods = "userListTest")
    public void productModuleTest() {
        driver = Setup.getWebdriverInstance();
        ProductModuleCheck.productLinkClickableCorrectly(driver);
        ProductModuleCheck.productPageRenderCorrectly(driver);
        ProductModuleCheck.productFirstNameUpdateCorrectly(driver);
        ProductModuleCheck.productFirstNameRollbackCorrectly(driver);
    }

    @Test(dependsOnMethods = "productModuleTest")
    public void cartFunctionalityTest() {
        driver = Setup.getWebdriverInstance();
        CartModuleCheck.clickFirstProductOnLatestProduct(driver);
        CartModuleCheck.clickAddToCartAndCheckOnCartPage(driver);
    }

    @Test(dependsOnMethods = "cartFunctionalityTest")
    public void closeBrowser() {
        Setup.getWebdriverInstance().close();
    }

}
