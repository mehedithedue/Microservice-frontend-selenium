package utils;

public class CartModuleUtils {

    public static class TEXT {
        public static final String cart_button_name = "Add to Cart";
        public static final String header_title = "Shopping Cart";
    }

    public static class LOCATOR {
        public static final String first_product_xpath = "//div[contains(@class, 'container')]//a[@href='/product/1'][1]";
        public static final String add_to_cart_button = "//div[contains(@class, 'container')]//div[contains(@class, 'row')][1]/div[contains(@class, 'col-md-3')][2]//div[contains(@class, 'list-group-item')][4]/button";
        public static final String details_page_book_name = "//div[contains(@class, 'container')]//div[contains(@class, 'row')][1]/div[contains(@class, 'col-md-3')][1]//div[contains(@class, 'list-group-item')][1]/h4";

        public static final String cart_page_first_book_name = "//div[contains(@class, 'container')]//div[contains(@class, 'row')][2]//div[contains(@class, 'list-group-item')][1]//div[contains(@class, 'col-md-3')][1]//a[@href='/product/1']";



    }

}
