package co.com.certification.testing.steps.loan;

import co.com.certification.testing.tasks.loan.*;
import co.com.certification.testing.util.CSVLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Screenshots;
import org.apache.commons.csv.CSVRecord;


import java.util.List;

import static co.com.certification.testing.steps.conf.Hooks.USER;


public class LoanSteps{

    private static final String RUTA_ARCHIVO_CSV = "C:\\Users\\Owner\\Documents\\auto_landgorilla\\qa-automation-suite\\src\\test\\resources\\data\\loan.csv";
    private List<CSVRecord> records;

    public LoanSteps() {
        records = CSVLoader.getRecords(RUTA_ARCHIVO_CSV);
    }

    @When("the user navigates to {string}")
    public void theUserNavigatesTo(String url) {
    }
    @When("valid home loan")
    public void validHomeLoan() {
        USER.attemptsTo(LoanHome.withTheFollowingField());
    }

    @And("the user clicks New Loan option")
    public void theUserClicksNewLoanOption() {
        USER.attemptsTo(NewLoanButton.withTheFollowingField());
    }

    @Screenshots
    @And("valid New Loan page")
    public void validNewLoanPage() {
        USER.attemptsTo(NewLoanPage.withTheFollowingField());
    }
    @Screenshots
    @And("enter data the new Loan Information")
    public void enterDataTheNewLoanInformation() {
        if (records != null && !records.isEmpty()) {
            USER.attemptsTo(EnterInformationLoan.withRecords(records, 0));
        }
    }
//    @Screenshots
//    @And("enter data in Property Information")
//    public void enterDataInPropertyInformation() {
//        USER.attemptsTo(EnterInformationProperty.withRecords(records));
//    }
//    @Screenshots
//    @And("enter data in Borrower Information")
//    public void enterDataInBorrowerInformation() {
//        USER.attemptsTo(EnterInformationBorrower.withCustomerData());
//    }
//    @Screenshots
//    @And("enter data in Map Budget")
//    public void enterDataInMapBudget() {
//        USER.attemptsTo(EnterInformationMapBudget.withCustomerData());
//    }
//    @Screenshots
//    @And("click Change Status")
//    public void clickChangeStatus() {
//        USER.attemptsTo(ChangeStatus.withCustomerData());
//    }
//    @Screenshots
//    @And("validate the loan new")
//    public void validateTheLoanNew() {
//        USER.attemptsTo(ValidateNewLoan.withCustomerData());
//    }
}
