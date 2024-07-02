package co.com.certification.testing.pages.loan;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoanPage {
    public static final Target BTN_NEW= Target.the("New Loan")
            .located(By.xpath("//button[@class='btn btn-success dropdown-toggle btn-sm']"));
    public static final Target BTN_NEW_LOAN= Target.the("New Loan Button")
            .located(By.xpath("//ul[@class='dropdown-menu']//a[text()[normalize-space() = 'New Loan']]\n"));
    public static final Target LABEL_NEW_LOAN_PAGE= Target.the("Page New Loan")
            .located(By.xpath("//li[@id='tabLoanInfo']//a[text()[normalize-space() = 'Loan Information']]\n"));
    public static final Target INPUT_LOAN_NUMBER= Target.the("Loan Number")
            .located(By.id("loanfilenum"));
    public static final Target BTN_LOAN_TYPE= Target.the("Loan Type")
            .located(By.xpath("//*[@id=\"tabloansetup-loan\"]/div/div/div[1]/div[3]/div/div/div/button/span[1]"));
    public static final Target BTN_LOAN_PROGRAM= Target.the("Loan Program")
            .located(By.xpath("//*[@id=\"tabloansetup-loan\"]/div/div/div[1]/div[6]/div/div/div/button/span[1]"));
    public static final Target BTN_TRANSACTION_TABLE= Target.the("Transaction Table")
            .located(By.xpath("//*[@id=\"tabloansetup-loan\"]/div/div/div[1]/div[11]/div/div/div/button/span[1]"));
    public static final Target BTN_LOAN_FUNDED_DATE= Target.the("Loan Funded Date")
            .located(By.xpath("//input[@name='loanfundeddate']"));
    public static final Target BTN_DATE= Target.the("Date")
            .located(By.xpath("//div[@class='datepicker-days']//table//th[@class='datepicker-switch']"));
    public static final Target INPUT_TERM_DAY= Target.the("Term Day")
            .located(By.xpath("//input[@name='loanterm']"));
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
            .located(By.xpath("//div[contains(text(), 'This Loan File Number already exists.')]\n"));
    public static final Target BTN_PROPERTY_INFORMATION= Target.the("Section Property Information")
            .located(By.xpath("//a[@href='#tabloansetup-property']"));
    public static final Target INPUT_SUBJECT= Target.the("Input Subject")
            .located(By.id("property_address"));
    public static final Target INPUT_ZIP= Target.the("Input ZIP ")
            .located(By.id("zipcode"));
    public static final Target INPUT_CITY= Target.the("Input City ")
            .located(By.id("city"));
    public static final Target BTN_BORROWER_INFORMATION= Target.the("Section Borrower Information")
            .located(By.xpath("//a[@href='#tabloansetup-borrower']"));
    public static final Target INPUT_BORROWER_FIRST_NAME= Target.the("Borrower First Name")
            .located(By.id("borrower_name"));
    public static final Target INPUT_BORROWER_LAST_NAME= Target.the("Borrower Last Name")
            .located(By.id("borrower_lastname"));
    public static final Target BTN_MAP_BUDGET= Target.the("Section Map Budget")
            .located(By.xpath("//a[@class='linkmapbudget']"));
    public static final Target INPUT_AMOUNT_LOAN= Target.the("Amount Loan")
            .located(By.xpath("//*[@id=\"MapBudgetSummary\"]/tbody/tr[1]/td[2]/div/div/input"));
    public static final Target INPUT_ADVANCED= Target.the("Input Advanced Loan")
            .located(By.xpath("//*[@id=\"MapBudgetSummary\"]/tbody/tr[1]/td[3]/div/div/input"));
    public static final Target INPUT_BORROWER_CONTRIBUTION= Target.the("Borrower Contribution")
            .located(By.xpath("//*[@id=\"MapBudgetSummary\"]/tbody/tr[2]/td[2]/div/div/input"));
    public static final Target INPUT_BORROWER_EQUITY= Target.the("Borrower Equity")
            .located(By.xpath("//*[@id=\"MapBudgetSummary\"]/tbody/tr[3]/td[2]/div/div/input"));
    public static final Target INPUT_CONTINGENCY= Target.the("Borrower Equity")
            .located(By.id("input-90"));
    public static final Target INPUT_INTEREST_RESERVE= Target.the("Borrower Equity")
            .located(By.id("input-91"));
    public static final Target BTN_LOAN_STATUS= Target.the("Loan Status")
            .located(By.xpath("//button[@data-statusloan='Setup']"));
    public static final Target BTN_ACTIVE_STATUS= Target.the("Activate Status")
            .located(By.xpath("//a[@data-status='Active']"));
    public static final Target BTN_CHANGE_ACTIVATE= Target.the("Change Activate")
            .located(By.xpath("//button[@class='btn btn-warning ladda-button']"));
    public static final Target BTN_CLOSE_ACTIVATE= Target.the("Close Activate")
            .located(By.xpath("//button[@class='btn btn-default']"));
    public static final Target BTN_SECTION= Target.the("Section")
            .located(By.xpath("//i[@class='fa fa-bars']"));
    public static final Target BTN_SECTION_LOAN= Target.the("Section Loan")
            .located(By.xpath("//a[contains(text(),'Loans')]"));
    public static final Target LBL_LOAN_NUMBER= Target.the("Loan Number")
            .located(By.xpath("//tr[@data-index='0']//td[@class='column-loan-file']"));
    public static final Target LABEL_FOUNDING_SOURCE= Target.the("Loan Number")
            .located(By.xpath("//th[@class='funding-source']"));
    public static final Target CHK_LOAN= Target.the("CheckBox Loan")
            .located(By.xpath("//a[text()='LFN-000092']/ancestor::tr/td[1]//input[@type='checkbox']\n"));
    public static final Target BTN_ACTION= Target.the("Action Button")
            .located(By.xpath("//button[@class='btn btn-default dropdown-toggle btn-sm notarchived-action btn-outline-primary']"));
    public static final Target BTN_DELETE_LOAN= Target.the("Delete Loan Button")
            .located(By.xpath("//li[@class='action-active']/a[@data-role='deleteloan' and text()='Delete Loan']"));
    public static final Target BTN_DELETE_CONFIRM= Target.the("Delete Loan Confirm Button")
            .located(By.xpath("//div[@class='jconfirm-buttons']/button[@class='btn btn-warning' and text()='delete']\n"));
    public static final Target LABEL_DELETE_LOAN= Target.the("Delete Loan Message")
            .located(By.xpath("//div[@class='jconfirm-content-pane']//div[@class='jconfirm-content' and contains(text(),'The selected loans have been deleted')]\n"));
    public static final Target BTN_SUCCESS_DELETE= Target.the("Success Loan")
            .located(By.xpath("//div[@class='jconfirm-buttons']//button[text()='ok']\n"));
    public static final Target BTN_BORROWER_TYPE= Target.the("Success Loan")
            .located(By.xpath("//button[@class='btn dropdown-toggle bs-placeholder btn-default']//span[@class='filter-option pull-left'][normalize-space()='Select an option']"));
    public static final Target BTN_ACTION_DRAW= Target.the("Action Draw Button")
            .located(By.xpath("//button[@class='btn btn-success dropdown-toggle btn-sm']"));
    public static final Target BTN_DRAW= Target.the("Draw Button")
            .located(By.xpath("//a[normalize-space()='Draw']"));
    public static final Target BTN_FIRST_DRAW= Target.the("First Draw Button")
            .located(By.xpath("//a[@class='createdraw option4']"));
    public static final Target BTN_FIRST_DRAW_PROCEED= Target.the("First Draw Proceed Button")
            .located(By.id("btn-select-apm-auto"));
    public static final Target BTN_FIRST_DRAW_CANCEL= Target.the("First Draw Cancel Button")
            .located(By.xpath("//button[@class='btn btn-default reset-apm-detected']"));
    public static final Target BTN_SCHEDULING_APPOINTMENT_NOT_REQUIRED= Target.the("Scheduling Appointment Not Required Button")
            .located(By.id("information1"));
    public static final Target BTN_SCHEDULING_APPOINTMENT_REQUIRED= Target.the("Scheduling Appointment Required Button")
            .located(By.id("information2"));
    public static final Target BTN_SCHEDULING_NOT_INSPECTION= Target.the("Scheduling Not Inspection Button")
            .located(By.id("information3"));
    public static final Target BTN_SAVE_INSPECTION_INFORMATION= Target.the("Save Inspection Information Button")
            .located(By.xpath("//button[text()='Save']\n"));
    public static final Target BTN_CANCEL_INSPECTION_INFORMATION= Target.the("Cancel Inspection Information Button")
            .located(By.xpath("//button[text()='Save']\n"));
    public static final Target BTN_TAB_CHANGE_ORDERS= Target.the("Change Orders Tab")
            .located(By.id("tabChangeOrders"));
    public static final Target BTN_TAB_DRAWS= Target.the("Draws Tab")
            .located(By.id("tabDraws"));
    public static final Target BTN_SELECT_DRAW= Target.the("Select Draw")
            .located(By.xpath("//div[@class='custom-col custom-button-open']"));
    public static final Target BTN_PAYEE_1= Target.the("Payye 1")
            .located(By.xpath("//span[@aria-labelledby='select2-jsp1-container']"));
    public static final Target INPUT_PAYEE_1= Target.the("Input Payye 1")
            .located(By.xpath("//input[@class='select2-search__field']"));
    public static final Target INPUT_REQUESTING_CONTINGENCY= Target.the("Input Requesting Contingency")
            .located(By.xpath("//input[@name='drawLines[2][multi_amount]']"));
    public static final Target INPUT_REQUESTING_INTEREST_RESERVE= Target.the("Input Requesting Interest Reserve")
            .located(By.xpath("//input[@name='drawLines[1][multi_amount]']"));
    public static final Target INPUT_RETAINAGE_CONTINGENCY= Target.the("Input Retainage Contingency")
            .located(By.xpath("//input[@name='drawLines[2][multi_retainage]']"));
    public static final Target INPUT_RETAINAGE_INTEREST_RESERVE= Target.the("Input Retainage Interest Reserve")
            .located(By.xpath("//input[@name='drawLines[1][multi_retainage]']"));
    public static final Target BTN_DEPOSIT_ITEM_CONTINGENCY= Target.the("Activate Deposit Item Contingency")
            .located(By.xpath("//*[@id=\"table-budget-modal\"]/tbody/tr[2]/td[16]/div/div/label"));
    public static final Target BTN_DEPOSIT_ITEM_INTEREST_RESERVE= Target.the("Activate Deposit Item Interest Reserve")
            .located(By.xpath("//*[@id=\"table-budget-modal\"]/tbody/tr[3]/td[16]/div/div/label"));
    public static final Target BTN_APPROVE_ITEM_CONTINGENCY= Target.the("Input Retainage Interest Reserve")
            .located(By.xpath("//*[@id=\"table-budget-modal\"]/tbody/tr[2]/td[17]/div/div/label"));
    public static final Target BTN_APPROVE_ITEM_INTEREST_RESERVE= Target.the("Input Retainage Interest Reserve")
            .located(By.xpath("//*[@id=\"table-budget-modal\"]/tbody/tr[3]/td[17]/div/div/label"));

    public static final Target BTN_SAVE_CLOSE= Target.the("Save Close Button")
            .located(By.xpath("//div[@class='buttonSaveCloseContainer']//button[@id='buttonSaveLine']"));
    public static final Target LBL_TOTAL_REQUESTING = Target.the("Quantity Total Requesting")
            .located(By.xpath("//tr[@class='totals']/td[@class='text-right td-requested'][2]\n"));
    public static final Target LBL_TOTAL_RETAINAGE_BALANCE = Target.the("Quantity Total Retainage Balance")
            .located(By.xpath("//tr[@class='totals']/td[@class='text-right td-requested'][1]\n"));
    public static final Target LBL_TOTAL_APPROVED = Target.the("Quantity Total Approved")
            .located(By.xpath("//tr[@class='totals']/td[@class='text-right td-adjusted'][1]/span\n"));
    public static final Target LBL_TOTAL_RETAINAGE = Target.the("Quantity Total Retainage")
            .located(By.xpath("//tr[@class='totals']/td[@class='text-right td-adjusted'][2]/span\n"));
    public static final Target LBL_TOTAL_APPROVED_LESS_RETAINAGE = Target.the("Quantity Total Approved Less Retainage")
            .located(By.xpath("//tr[@class='totals']/td[@class='text-right td-less-retainage']/span\n"));
    public static final Target BTN_APPROVED_ITEM_CONTINGENCY_ON_1 = Target.the("Approved Item Contingency ON")
            .located(By.xpath("//tr[contains(@class, 'js-tr-linedrawitem')]//td[contains(@class, 'draw-td-description')]//div[@class='item-description']//text()[contains(., 'Contingency')]/ancestor::td/ancestor::tr//td[@class='small text-center vertical-align-middle']//div[@class='onoffswitch onoffswitch-approved-lineitem js-change-approval-status  label-approved-lineitem']"));
    public static final Target BTN_APPROVED_ITEM_CONTINGENCY_ON_2 = Target.the("Approved Item Contingency ON")
            .located(By.xpath("//tr[contains(@class, 'js-tr-linedrawitem')]//td[contains(@class, 'draw-td-description')]//div[@class='item-description']//text()[contains(., 'Contingency')]/ancestor::td/ancestor::tr//td[@class='small text-center vertical-align-middle']//div[@class='onoffswitch onoffswitch-approved-lineitem js-change-approval-status label-approved-lineitem']"));
    public static final Target BTN_APPROVED_ITEM_CONTINGENCY_OFF = Target.the("Approved Item Contingency OFF")
            .located(By.xpath("//tr[contains(@class, 'js-tr-linedrawitem')]//td[contains(@class, 'draw-td-description')]//div[@class='item-description']//text()[contains(., 'Contingency')]/ancestor::td/ancestor::tr//td[@class='small text-center vertical-align-middle']//div[@class='onoffswitch onoffswitch-approved-lineitem js-change-approval-status ']"));
    public static final Target BTN_APPROVED_ITEM_INTEREST_RESERVE_ON = Target.the("Approved Item Interest ON")
            .located(By.xpath("//tr[contains(@class, 'js-tr-linedrawitem')]//td[contains(@class, 'draw-td-description')]//div[@class='item-description']//text()[contains(., 'Interest Reserve')]/ancestor::td/ancestor::tr//td[@class='small text-center vertical-align-middle']//div[@class='onoffswitch onoffswitch-approved-lineitem js-change-approval-status label-approved-lineitem']"));
    public static final Target BTN_APPROVED_ITEM_INTEREST_RESERVE_OFF = Target.the("Approved Item Interest OFF")
            .located(By.xpath("//tr[contains(@class, 'js-tr-linedrawitem')]//td[contains(@class, 'draw-td-description')]//div[@class='item-description']//text()[contains(., 'Interest Reserve')]/ancestor::td/ancestor::tr//td[@class='small text-center vertical-align-middle']//div[@class='onoffswitch onoffswitch-approved-lineitem js-change-approval-status ']"));
    public static final Target BTN_DEPOSIT_ITEM_ON = Target.the("Deposit Item ON")
            .located(By.xpath("//div[@class='custom-col pull-right margin-top-4']"));
    public static final Target BTN_APPROVE_ALL_ITEM = Target.the("Approve All Item Button")
            .located(By.xpath("//*[@for=\"line_approve_option_master\"]"));
    public static final Target BTN_EXCLUDE_ALL_RETAINAGE = Target.the("Exclude All Retainage Button")
            .located(By.xpath("//*[@for=\"line_retainage_master\"]"));
    public static final Target BTN_MARK_ALL_DEPOSIT = Target.the("Mark All Deposit Button")
            .located(By.xpath("//*[@for=\"line_storedmaterials_master\"]"));
    public static final Target BTN_SEARCH_QUICK = Target.the("Search Quick")
            .located(By.id("lSearch"));
    public static final Target BTN_CLEAR_SEARCH_QUICK = Target.the("Clear Search Quick Button")
            .located(By.xpath("//button[@id='btn-resetQS']//i[@class='fa fa-times']"));
    public static final Target BTN_POST_TRANSACTIONS = Target.the("Post Transactions Button")
            .located(By.xpath("//a[normalize-space()='Post Transactions']"));
    public static final Target BTN_DOWNLOAD_TEMPLATE = Target.the("Download Template Button")
            .located(By.xpath("//font[contains(text(),'Avanzado')]"));
    public static final Target BTN_CHANGE_STATUS = Target.the("Change Status Button")
            .located(By.xpath("//a[@title='Change Status']"));
    public static final Target BTN_STATUS = Target.the("New Status Button")
            .located(By.xpath("//button[@class='btn dropdown-toggle btn-default']"));
    public static final Target BTN_CONFIRMED_CHANGE = Target.the("Confirmed Change Button")
            .located(By.id("buttonSaveChangeStatus"));
    public static final Target BTN_ARCHIVE_LOAN = Target.the("Archive Loan Button")
            .located(By.xpath("//a[@data-role='archiveloan']"));
    public static final Target BTN_CONFIRMED_LOAN = Target.the("Confirmed Archive Loan Button")
            .located(By.xpath("//button[@class='btn btn-warning']"));
    public static final Target BTN_VIEW_ARCHIVED = Target.the("View Arhived Button")
            .located(By.xpath("//a[normalize-space()='View Archived']"));
    public static final Target BTN_CLEAR_SEARCH = Target.the("Clear Search Button")
            .located(By.id("btnclearAdvancedSearch"));
    public static final Target BTN_LOAN_TAB = Target.the("Tab Loan")
            .located(By.xpath("//div[@class='navbar-header']//a[contains(text(),'Loans')]"));
    public static final Target BTN_CHECK_LOAN = Target.the("Tab Loan")
            .located(By.xpath("//div[@class='checkbox checkbox-primary checkall d-inline-block-lg']"));
    public static final Target LABEL_ARCHIVED = Target.the("Archived Label")
            .located(By.id("showFolder"));

}
