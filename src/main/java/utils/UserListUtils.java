package utils;

public class UserListUtils {

    public static class TEXT {
        public static final String header_title = "Users";
        public static final String test_user_name = "test.user";
        public static final String test_user_first_name = "Test";
        public static final String test_user_first_name_change = "Testing";
    }

    public static class LOCATOR {
        public static final String header_xpath = "//div[contains(@class, 'container')]/h1[1]";
        public static final String table_first_row = "//div[contains(@class, 'container')]//table/tbody/tr[1]";
        public static final String table_first_row_username = table_first_row + "/td[2]";
        public static final String table_first_row_first_name = table_first_row + "/td[3]";
        public static final String table_first_row_edit_button = table_first_row + "/td[7]/a/i[contains(@class, 'fa-edit')]";

        public static final String user_edit_firstname_id = "firstName";

        public static final String user_edit_form_submit_button = "//button[@type='submit']";
    }

}
