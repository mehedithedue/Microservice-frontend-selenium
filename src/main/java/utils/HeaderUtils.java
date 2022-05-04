package utils;

public class HeaderUtils {

    public static class TEXT {
        public static final String user_menu_text = "Users";
        public static final String product_menu_text = "Products";
    }

    public static class LOCATOR {
        public static final String header_xpath = "//div[contains(@class, 'container')]//h1[1]";
        public static final String dropdown_menu_id = "adminmenu";
        public static final String cart_page_link = "//nav//div[contains(@class, 'navbar-nav')]/a/i[contains(@class, 'fa-shopping-cart')]";

    }

}
