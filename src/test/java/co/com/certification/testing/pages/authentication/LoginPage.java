package co.com.certification.testing.pages.authentication;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class LoginPage {
    public static final Target LOGIN= Target.the( "Login Page")
            .located(By.xpath("//*[@id=\"asso\"]"));

    public static final Target INPUT_USERNAME= Target.the("Username")
            .located(By.xpath("//*[@id=\"txtLogin\"]"));

    public static final Target INPUT_PASSWORD= Target.the("Password")
            .located(By.xpath("//*[@id=\"txtPassword\"]"));

    public static final Target BTN_LOGIN= Target.the("Button Login")
            .located(By.xpath("//*[@id=\"btnLogin\"]"));

    public static final Target HOME= Target.the("Start")
            .located(By.xpath("//div[@class='col-lg-3']//div[@class='ibox ibox-primary']//div[@class='ibox-title']/h5[text()='Orders']\n"));

    public static final Target USER_PASS_INVALIDO= Target.the("Username and Password invalid")
            .located(By.xpath("//*[@id=\"loginAlert\"]/div/span"));
    public static final Target EMAIL_EMPTY= Target.the("Email Empty")
            .located(By.xpath("//*[contains(text(),'The Email field is required.')]"));
    public static final Target PASSWORD_EMPTY= Target.the("Password Empty")
            .located(By.xpath("//*[contains(text(),'The Password field is required.')]"));
    public static final Target FORGOT_PASS= Target.the("Forgot Password")
            .located(By.xpath("//*[@id=\"afpass\"]"));

    public static final Target EMAIL_RECOVERY= Target.the("Email Recovery")
            .located(By.xpath("//*[@id=\"email_address\"]"));

    public static final Target BTN_IDENTIFY= Target.the("Button Login")
            .located(By.xpath("//*[@id=\"forgotPasswBlockClient\"]/div[2]/div/div[2]/button"));

    public static final Target MESSAGE_RECOVERY= Target.the("Message Recovery")
            .located(By.xpath("//*[contains(text(),'A message was sent to your e-mail address with instructions to reset your password')]"));

    public static final Target EMAIL_INVALID= Target.the("Email Address Invalid")
            .located(By.xpath("//span[contains(text(),'Please enter a valid email address.')]"));

    public static final Target EMAIL_ANS_PASSWORD_INVALID= Target.the("Email Address Invalid")
            .located(By.xpath("//span[contains(text(),'The username or password is invalid.')]"));

    public static final Target LBL_RESET_PASSWORD= Target.the("Reset Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]"));

    public static final Target INPUT_NEW_PASSWORD= Target.the("New Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]/div[3]/input"));
    public static final Target INPUT_NEW_PASSWORD_AGAIN= Target.the("New Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]/div[4]/input"));

    public static final Target MESSAGE_EXPIRED= Target.the("Message Expired")
            .located(By.xpath("//span[@class=\"link-reset-password\"]"));

    public static final Target BTN_EXPIRED= Target.the("Button Expired")
            .located(By.xpath("//a[contains(text(),'click here')]"));

    public static final Target BTN_SETPASSWORD= Target.the("Button Set The Password")
            .located(By.xpath("//button[contains(text(),'Set The Password')]"));

    public static final Target MESSAGE_UPDATE= Target.the("Message Update")
            .located(By.xpath("//*[contains(text(),'Your password was successfully updated.')]"));

    public static final Target BTN_LOAN= Target.the("Loan Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Loan')]"));
    public static final Target BTN_ORDERS= Target.the("Orders Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Orders')]"));
    public static final Target BTN_CONTACTS= Target.the("Contacts Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Contacts')]"));
    public static final Target BTN_USERS= Target.the("Users Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Users')]"));
    public static final Target BTN_PROJECTS= Target.the("Projects Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Projects')]"));
    public static final Target BTN_HUD= Target.the("Hud Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'HUD Consultant Requests')]"));
    public static final Target BTN_PAYMENTS= Target.the("Payment Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Payments')]"));
    public static final Target BTN_REPORTS= Target.the("Reports Button")
            .located(By.xpath("//nav[@class='navbar menu-horizontal-top-zindex navbar-horizontal']//a[contains(text(), 'Reports')]"));
    public static final Target LABEL_ORDER_ACTIVATE= Target.the("Orders Activate")
            .located(By.xpath("//div[@class='ibox-title']//h5[text()='Orders']"));
    public static final Target LABEL_ORDER_ACTIVATE_MONTH= Target.the("Orders Activate Month")
            .located(By.xpath("(//span[contains(text(), 'New this Month')])[1]\n"));
    public static final Target LABEL_ORDER_ACTIVATE_WEEK= Target.the("Orders Activate Week")
            .located(By.xpath("(//span[contains(text(), 'New this Week')])[1]"));
    public static final Target BTN_PERIOD= Target.the("Selector Period")
            .located(By.xpath("//*[@id=\"dashboard\"]/div/div[2]/div/div/div[1]/div/div[1]/div/button"));
    public static final Target DAY_PERIOD= Target.the("Selector Period Day")
            .located(By.xpath("//li//a//span[contains(text(),'Today')]"));
    public static final Target WEEK_PERIOD= Target.the("Selector Period Week")
            .located(By.xpath("//li//a//span[contains(text(),'This Week')]"));
    public static final Target MONTH_PERIOD= Target.the("Selector Period Month")
            .located(By.xpath("//li//a//span[contains(text(),'This Month')]"));
    public static final Target BTN_SEARCH= Target.the("Search Period")
            .located(By.xpath("//i[@class='fas fa-redo-alt']"));
    public static final Target LABEL_GRAPHIC_VALIDATE= Target.the("Validate Graphic")
            .located(By.xpath("//span[@class='axis-title left']\n"));
    public static final Target BTN_FILTERS= Target.the("Filters")
            .located(By.xpath("//body/div[@id='wrapper']/div[@id='page-wrapper']/div[@id='dashboard']/div[@class='wrapper wrapper-content dashboard wrapper-ibox-notification']/div[@class='row dashboard__stats']/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]"));
    public static final Target BTN_FILTER_BY= Target.the("Filters By")
            .located(By.xpath("//*[@id=\"filterModal\"]/div/div/div[2]/div[2]/div/div[1]/div/div/div/button"));
    public static final Target BTN_FILTERS_LOAN_TYPE= Target.the("Loan Type")
            .located(By.xpath("//span[contains(text(),'Loan Type')]"));
    public static final Target BTN_FILTERS_SYSTEM_USER= Target.the("System User")
            .located(By.xpath("//span[contains(text(),'System User')]"));
    public static final Target BTN_FILTERS_PRODUCT_ORDERED= Target.the("Product Ordered")
            .located(By.xpath("//span[contains(text(),'Product Ordered')]"));
    public static final Target BTN_FILTERS_ORDER_STATUS= Target.the("Order Status")
            .located(By.xpath("//span[contains(text(),'Order Status')]"));
    public static final Target BTN_SAVE_FILTER= Target.the("Save Button")
            .located(By.xpath("//div[@id='filterModal']//button[@type='button'][normalize-space()='Save']"));
    public static final Target BTN_LOAN_FILTER= Target.the("Filter Loan")
            .located(By.xpath("//div[@class='row dashboard__stats']//div[2]//div[1]//div[1]//div[1]//a[1]//i[1]"));
    public static final Target BTN_CHANGE_ORDERS_FILTER= Target.the("Change Ordesrs")
            .located(By.xpath("//div[@class='row dashboard__stats']//div[4]//div[1]//div[1]//div[1]//a[1]//i[1]"));
    public static final Target BTN_FILTERS_LOAN_PROGRAM= Target.the("Order Status")
            .located(By.xpath("//span[contains(text(),'Loan Program')]"));
    public static final Target BTN_FILTERS_INVESTOR= Target.the("Investor")
            .located(By.xpath("//span[contains(text(),'Investor')]"));
    public static final Target BTN_FILTERS_TRANSACTION_TABLE= Target.the("Transaction Table")
            .located(By.xpath("//span[contains(text(),'Transaction Table')]"));
    public static final Target BTN_FILTERS_LAST_ACTIVITY= Target.the("Last Activity")
            .located(By.xpath("//span[contains(text(),'Last Activity')]"));
    public static final Target BTN_SELECT_LAST_ACTIVITY= Target.the("Select Last Activity")
            .located(By.xpath("//span[@class='filter-option pull-left'][normalize-space()='[Select ]']"));
    public static final Target BTN_DRAW_FILTER= Target.the("Draw Loan")
            .located(By.xpath("//div[@class='row dashboard__stats']//div[3]//div[1]//div[1]//div[1]//a[1]//i[1]"));
    public static final Target BTN_SELECT_VIEW= Target.the("Select View")
            .located(By.xpath("//*[@id=\"dashboard\"]/div/div[2]/div/div/div[1]/div/div[4]/div/button"));
    public static final Target BTN_DAY= Target.the("Select By Day")
            .located(By.xpath("//a//span[contains(text(),'Day')]"));
    public static final Target BTN_WEEK= Target.the("Select By Week")
            .located(By.xpath("//a//span[contains(text(),'Week') and not(contains(text(), ' Week'))]"));
    public static final Target BTN_MONTH= Target.the("Select By Month")
            .located(By.xpath("//a//span[contains(text(),'Month') and not(contains(text(), ' Month'))]"));
    public static final Target BTN_QUARTER= Target.the("Select By Quarter")
            .located(By.xpath("//a//span[contains(text(),'Quarter') and not(contains(text(), ' Quarter'))]"));
    public static final Target BTN_YEAR= Target.the("Select By Year")
            .located(By.xpath("//a//span[contains(text(),'Year') and not(contains(text(), ' Year'))]"));
    public static final Target BTN_FILTERS_LOAN_ACTIVITY= Target.the("Filter Loan Activity")
            .located(By.xpath("//*[@id=\"dashboard\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/div[2]/a/i"));
    public static final Target LABEL_INFORMATION_VALIDATE= Target.the("Validate Information")
            .located(By.xpath("//div[normalize-space()='Borrower']"));
    public static final Target LABEL_ACTIVATE_LOAN= Target.the("Home Loan")
            .located(By.xpath("//ul[@id='filterLoanStatus']//a[text()[normalize-space() = 'Active']]\n"));
    public static final Target BTN_NEW= Target.the("New Loan")
            .located(By.xpath("//button[@class='btn btn-success dropdown-toggle btn-sm']"));
    public static final Target BTN_NEW_LOAN= Target.the("New Loan Button")
            .located(By.xpath("//ul[@class='dropdown-menu']//a[text()[normalize-space() = 'New Loan']]\n"));
    public static final Target LABEL_NEW_LOAN_PAGE= Target.the("Page New Loan")
            .located(By.xpath("//li[@id='tabLoanInfo']//a[text()[normalize-space() = 'Loan Information']]\n"));
    public static final Target INPUT_LOAN_NUMBER= Target.the("Loan Number")
            .located(By.id("loanfilenum"));
    public static final Target BTN_LOAN_TYPE= Target.the("Loan Type")
            .located(By.xpath("//button[@data-id='loanType']"));
    public static final Target BTN_LOAN_PROGRAM= Target.the("Loan Program")
            .located(By.xpath("//button[@data-id='loanprogram']"));
    public static final Target BTN_TRANSACTION_TABLE= Target.the("Transaction Table")
            .located(By.xpath("//button[@data-id='ddlbtransaction']"));
    public static final Target BTN_LOAN_FUNDED_DATE= Target.the("Loan Funded Date")
            .located(By.xpath("//input[@name='loanfundeddate']"));
    public static final Target BTN_DATE= Target.the("Date")
            .located(By.xpath("//div[@class='datepicker-days']//table//th[@class='datepicker-switch']"));
    public static final Target INPUT_TERM_DAY= Target.the("Term Day")
            .located(By.xpath("//input[@name='loanterm']"));
    public static final Target BTN_SESSION= Target.the("Session")
            .located(By.xpath("//a[@class='user-header']"));
    public static final Target BTN_LOGOUT= Target.the("Logout")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_LOAN_PURPOSE= Target.the("Logout")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_BRANCH= Target.the("Select Branch")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_INVESTOR= Target.the("Select Investor")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_APPRAISED_VALUE= Target.the("Input Appraised Value")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_FUNDING_ACCOUNT= Target.the("Input Fundin Account")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_TITLE_COMPANY= Target.the("Input Company")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_TITLE_PERSON_NAME= Target.the("Input Person Name")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_TITLE_EMAIL= Target.the("Input Email")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_PHONE_NUMBER= Target.the("Input PhoneNumer")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_RETAINAGE_IMPROVED= Target.the("Input Retainage Improved")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_RETAINAGE_DEPOSIT= Target.the("Input Retainage Deposit")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_POINTS_PAID= Target.the("Input Point Paid")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_DISBURSEMENT_METHOD= Target.the("Input Disbursement Method")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_NOTE_DATE= Target.the("Note Date")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target BTN_LOAN_DUE_DATE= Target.the("Loan Due Date")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_CHANNEL_SOURCE= Target.the("Input Channel Source")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_CHANNEL_CONTACT_NAME= Target.the("Input Channel Contact Name")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target INPUT_CUSTOMER_NAME= Target.the("Input Customer Name")
            .located(By.xpath("//li/a[text()='Log Out']\n"));
    public static final Target LABEL_ALREADY_LOAN= Target.the("Number Loan Already")
            .located(By.xpath("//div[@class='invalid-feedback']"));
}