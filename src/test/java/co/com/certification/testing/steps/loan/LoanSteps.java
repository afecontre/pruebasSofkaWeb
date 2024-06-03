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

    private static final String RELATIVE_CSV_PATH = "src/test/resources/data/loan.csv";

    private List<CSVRecord> records;

    public LoanSteps() {
        records = CSVLoader.getRecords(RELATIVE_CSV_PATH);
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

    @And("valid New Loan page")
    public void validNewLoanPage() {
        USER.attemptsTo(NewLoanPage.withTheFollowingField());
    }
    /*@Screenshots
    @And("enter data the new Loan Information")
    public void enterDataTheNewLoanInformation() {
        if (records != null && !records.isEmpty()) {
            USER.attemptsTo(EnterInformationLoan.withRecords(records, 0));
        }
    }*/

    @Screenshots
    @And("enter data the new Loan Information {string}")
    public void enterDataTheNewLoanInformation(String loan_type) {
        if (records != null && !records.isEmpty()) {
            USER.attemptsTo(EnterInformationLoan.withRecords(records, 0,loan_type));
        }
    }
}
