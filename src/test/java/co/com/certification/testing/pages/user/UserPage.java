package co.com.certification.testing.pages.user;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class UserPage {
    public static final Target BTN_NEW_USER= Target.the("New User")
            .located(By.xpath("//button[@class='btn btn-success btn-sm btnFormRowTable']"));
    public static final Target INPUT_EMAIL_USER= Target.the("Input Email User")
            .located(By.id("username_processor"));
    public static final Target INPUT_FIRST_NAME_USER= Target.the("Input First Name User")
            .located(By.id("firstname_processor"));
    public static final Target INPUT_LAST_NAME_USER= Target.the("Input Last Name User")
            .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target INPUT_TITLE_USER= Target.the("Input Title User")
            .located(By.xpath("//input[@placeholder='Title']"));
    public static final Target INPUT_PHONE_USER= Target.the("Input PhoneNumber User")
            .located(By.id("phone_processor"));
    public static final Target BTN_SELECT_ROLE_USER= Target.the("Roler User Select Button")
            .located(By.id("cbRole"));
    public static final Target BTN_ROLE_USER= Target.the("Roler User Button")
            .located(By.xpath("//*[@class=\"form-control input-sm required\"]/option[@value=\"isadministrator\"]"));
    public static final Target BTN_SAVE_USER= Target.the("Save User Button")
            .located(By.id("saveChangeUser"));
    public static final Target BTN_CONFIRMED_ACTION= Target.the("OK User Button")
            .located(By.xpath("//button[normalize-space()='ok']"));
    public static final Target BTN_CLOSE_USER= Target.the("Close User Button")
            .located(By.xpath("//button[@class='btn btn-white']"));
    public static final Target BTN_ADVANCED_USER= Target.the("Advanced User Button")
            .located(By.xpath("//button[normalize-space()='Advanced']"));
    public static final Target INPUT_SEARCH_USER= Target.the("Input Search User")
            .located(By.id("tbl-tab2-user-filter"));
    public static final Target LBL_USER_NAME= Target.the("Label User Name")
            .located(By.xpath("//div[@class='th-inner sortable both asc']"));
    public static final Target BTN_CHECK_USER= Target.the("Check User")
            .located(By.xpath("//div[@class='checkbox  checkbox-primary']"));
    public static final Target BTN_ACTION_USER= Target.the("Action User Button")
            .located(By.xpath("//span[normalize-space()='Actions']"));
    public static final Target BTN_DELETE_USER= Target.the("Delete User Button")
            .located(By.xpath("//a[contains(@class,'showTooltip btnDeleteRowTable')]"));
    public static final Target BTN_CONFIRM_DELETE_USER= Target.the("Confirm Delete User Button")
            .located(By.xpath("//button[@class='btn btn-warning ladda-button']"));
    public static final Target BTN_CANCEL_DELETE_USER= Target.the("Cancel Delete User Button")
            .located(By.xpath("//div[contains(@class,'jconfirm-buttons')]//button[contains(@type,'button')][normalize-space()='Close']"));
    public static final Target LABEL_USER_NAME= Target.the("User Name Label")
            .located(By.xpath("//a[contains(@class, 'form-link') and contains(@class, 'btnFormRowTable') and @data-table='tbl-tab2-systemuser']\n"));
    public static final Target LABEL_ROLE_USER= Target.the("Role User Label")
            .located(By.xpath("//*[@id=\"tbl-tab2-systemuser\"]/tbody/tr/td[4]"));
    public static final Target INPUT_PASSWORD_USER= Target.the("New Password")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD_USER_CONFIRM= Target.the("New Password Confirm")
            .located(By.id("password2"));
    public static final Target BTN_SAVE_CHANGES= Target.the("Save Changes")
            .located(By.xpath("//button[@class='submit-button ladda-button btn btn-primary btn-lg block full-width m-b']"));
    public static final Target BTN_TIME_ZONE= Target.the("TimeZone Button")
            .located(By.id("timezoneID"));
    public static final Target BTN_TIME_ZONE_PACIF= Target.the("TimeZone Pacific Station Button")
            .located(By.xpath("//*[@id=\"timezoneID\"]/option[2]"));
    public static final Target BTN_SAVE_CHANGES_INFORMATION= Target.the("Save Changes Information")
            .located(By.xpath("//button[@class='ladda-button btn btn-primary btn-lg block full-width m-b']"));

    public static final Target BTN_USER_TAB= Target.the("User Tab")
            .located(By.xpath("//div[@class='navbar-header']//a[@class='dropbtn'][normalize-space()='Users']"));
    public static final Target BTN_SYSTEM_USER= Target.the("System User Tab")
            .located(By.xpath("//div[@class='navbar-header']//a[contains(text(),'System Users')]"));

}
