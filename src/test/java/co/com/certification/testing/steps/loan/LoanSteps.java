package co.com.certification.testing.steps.loan;

import co.com.certification.testing.tasks.draws.*;
import co.com.certification.testing.tasks.loan.*;
import co.com.certification.testing.util.CSVLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Screenshots;
import org.apache.commons.csv.CSVRecord;


import java.util.List;

import static co.com.certification.testing.steps.conf.Hooks.USER;


public class LoanSteps{

    private static final String RELATIVE_CSV_PATH = "src/test/resources/data/loan.csv";
    private final List<CSVRecord> records;

    public LoanSteps() {
        records = CSVLoader.getRecords(RELATIVE_CSV_PATH);
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

    @And("create {string} new Draw")
    public void createNewDraw(String number) {
        USER.attemptsTo(CreateDraws.withTheFollowingField(number));
    }

    @And("add line item {string}")
    public void addLineItem(String number) {
        USER.attemptsTo(AddItem.withTheFollowingField(number));
    }

    @And("add line item and full approval")
    public void addLineItemAndFullApproval() {
        USER.attemptsTo(AddItemFullApproval.withTheFollowingField());
    }

    @And("add line item and deposits confirmed")
    public void addLineItemAndDepositsConfirmed() {
        USER.attemptsTo(AddItemDepositsConfirmed.withTheFollowingField());
    }

    @And("add line item and approve confirmed")
    public void addLineItemAndApproveConfirmed() {
        USER.attemptsTo(AddItemApproveConfirmed.withTheFollowingField());
    }

    @And("add line item and Contigency approve confirmed")
    public void addLineItemAndContigencyApproveConfirmed() {
        USER.attemptsTo(AddItemContingencyApprove.withTheFollowingField());
    }

    @And("add line item and Interest approve confirmed")
    public void addLineItemAndInterestApproveConfirmed() {
        USER.attemptsTo(AddItemInterestApprove.withTheFollowingField());
    }

    @And("the user clicks Quick Search and enter Search information {string}")
    public void theUserClicksQuickSearchAndEnterSearchInformation(String number_loan) {
        USER.attemptsTo(QuickSearch.withTheFollowingField(number_loan));
    }

    @Then("validate the loan exists")
    public void validateTheLoanExists() {
        USER.attemptsTo(ValidateLoanExists.withCustomerData());
    }

    @Then("validate the loan")
    public void validateTheLoan() {
        USER.attemptsTo(ValidateLoan.withCustomerData());
    }

    @Screenshots
    @And("the user download Template")
    public void theUserDownloadTemplate() {
        USER.attemptsTo(DownloadTemplate.withCustomerData());
    }

    @And("the user upload Template")
    public void theUserUploadTemplate() {
        USER.attemptsTo(UploadTemplate.withCustomerData());
    }

    @And("change status {string}")
    public void changeStatus(String status) {
        USER.attemptsTo(ChangeStatusLoan.withCustomerData(status));
    }

    @And("archive Loan")
    public void archiveLoan() {
        USER.attemptsTo(ArchiveLoan.withCustomerData());
    }

    @And("delete Loan")
    public void deleteLoan() {
        USER.attemptsTo(DeleteLoanActivate.withCustomerData());
    }

    @When("unarchive Loan")
    public void unarchiveLoan() {
        USER.attemptsTo(ClearSearch.withCustomerData());
    }

    @When("clear search")
    public void clearSearch() {
        USER.attemptsTo(ClearSearch.withCustomerData());
    }
    @And("view Archived")
    public void viewArchived() {
        USER.attemptsTo(ViewArchived.withCustomerData());
    }
    @And("the user enter Search information {string}")
    public void theUserEnterSearchInformation(String number_loan) {
        USER.attemptsTo(QuickSearch_New.withTheFollowingField(number_loan));
    }

    @And("switch to active loan")
    public void switchToActiveLoan() {
        USER.attemptsTo(SwitchToActiveLoan.withCustomerData());
    }

    @Then("return to loan tab")
    public void returnToLoanTab() {
        USER.attemptsTo(ReturnToLoanTab.withCustomerData());
    }

    @And("the user view Active Loan")
    public void theUserViewActiveLoan() {
        USER.attemptsTo(ViewActiveLoan.withCustomerData());
    }

    @Then("valid tab Active Loan")
    public void validTabActiveLoan() {

    }

    @When("the user clicks Add System User")
    public void theUserClicksAddSystemUser() {
        USER.attemptsTo(ClicksAddSystemUser.withCustomerData());
    }

    @And("validate warning message")
    public void validateWarningMessage() {
        USER.attemptsTo(WarningMessage.withCustomerData());
    }

    @And("enter information System User")
    public void enterInformationSystemUser() {
        USER.attemptsTo(EnterAddSystemUser.withCustomerData());
    }

    @And("select the loan")
    public void selectTheLoan() {
        USER.attemptsTo(SelectTheLoan.withCustomerData());
    }

    @And("the user clicks Remove System User")
    public void theUserClicksRemoveSystemUser() {
        USER.attemptsTo(RemoveSystemUser.withCustomerData());
    }

    @And("the user clicks Send Messages")
    public void theUserClicksSendMessages() {
        USER.attemptsTo(SendMessages.withCustomerData());
    }

    @When("the user enter Search information delete {string}")
    public void theUserEnterSearchInformationDelete(String number_loan) {
        USER.attemptsTo(EnterInformationDelete.withTheFollowingField(number_loan));
    }
}
