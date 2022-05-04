package utils;

public class ProductModuleUtils {

    public static class TEXT {
        public static final String header_title = "Products";
        public static final String test_product_name = "Modern Indian Literature: Poems and Short Stories";
        public static final String test_product_name_change = "Modern Indian Literature: Poems and Short Stories test";
    }

    public static class LOCATOR {

        public static final String table_row = "//div[contains(@class, 'container')]//table/tbody/tr[1]";
        public static final String table_row_product_name = table_row + "/td[2]";
        public static final String table_first_row_edit_button = table_row + "/td[7]/a/i[contains(@class, 'fa-edit')]";

        public static final String product_edit_name_id = "name";

        public static final String product_edit_form_submit_button = "//button[@type='submit']";
    }

}
