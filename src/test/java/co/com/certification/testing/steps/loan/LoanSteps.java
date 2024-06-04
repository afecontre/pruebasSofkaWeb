package co.com.certification.testing.steps.loan;

import co.com.certification.testing.tasks.draws.CreateDraws;
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
    private final List<CSVRecord> records;
    private final int currentIndex;

    public LoanSteps() {
        records = CSVLoader.getRecords(RELATIVE_CSV_PATH);
        currentIndex = 0;
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
            for (int i = 0; i < records.size(); i++) {
                // Llama al método attemptsTo() con el registro actual
                USER.attemptsTo(EnterInformationLoan.withRecords(records, i,loan_type));
            }
        }
    }

    @And("delete the loan created")
    public void deleteTheLoanCreated() {
        USER.attemptsTo(DeleteLoan.withTheFollowingField());
    }

    @And("create new Draw")
    public void createNewDraw() {
        USER.attemptsTo(CreateDraws.withTheFollowingField());
    }
}
