package co.com.certification.testing.pages.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class DashboardPage {
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
    public static final Target BTN_FILTERS_LOAN_MATURITY= Target.the("Filter Loan Maturity")
            .located(By.xpath("//div[@class='row dashboard__lists']//div[2]//div[1]//div[1]//div[1]//a[1]//i[1]"));
    public static final Target LABEL_INFORMATION_VALIDATE= Target.the("Validate Information")
            .located(By.xpath("//div[normalize-space()='Borrower']"));
    public static final Target LABEL_ACTIVATE_LOAN= Target.the("Home Loan")
            .located(By.xpath("//ul[@id='filterLoanStatus']//a[text()[normalize-space() = 'Active']]\n"));
    public static final Target BTN_LAST_ACTIVITY= Target.the("Last Activity Time Button")
            .located(By.xpath("//button[@title='[Select ]']"));
    public static final Target BTN_FILTERS_LOAN_PENDING_DRAWS= Target.the("Filter Loan Pending Draws")
            .located(By.xpath("//div[@class='row dashboard__lists']//div[3]//div[1]//div[1]//div[1]//a[1]//i[1]"));
    public static final Target BTN_FILTERS_LOAN_PENDING_CHANGE_ORDERS= Target.the("Filter Loan Pending Change Orders")
            .located(By.xpath("//div[@class='row dashboard__lists']//div[4]//div[1]//div[1]//div[1]//a[1]//i[1]"));


}