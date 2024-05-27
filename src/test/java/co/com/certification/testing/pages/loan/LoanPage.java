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


}