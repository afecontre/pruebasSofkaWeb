package co.com.certification.testing.steps.loan;

import co.com.certification.testing.tasks.dashboard.ItemActivate;
import co.com.certification.testing.tasks.loan.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Screenshots;

import static co.com.certification.testing.steps.conf.Hooks.USER;


public class LoanSteps{

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
        USER.attemptsTo(EnterInformationLoan.withCustomerData());
    }
    @Screenshots
    @And("enter data in Property Information")
    public void enterDataInPropertyInformation() {
        USER.attemptsTo(EnterInformationProperty.withCustomerData());
    }
    @Screenshots
    @And("enter data in Borrower Information")
    public void enterDataInBorrowerInformation() {
        USER.attemptsTo(EnterInformationBorrower.withCustomerData());
    }
    @Screenshots
    @And("enter data in Map Budget")
    public void enterDataInMapBudget() {
        USER.attemptsTo(EnterInformationMapBudget.withCustomerData());
    }
    @Screenshots
    @And("click Change Status")
    public void clickChangeStatus() {
        USER.attemptsTo(ChangeStatus.withCustomerData());
    }
    @Screenshots
    @And("validate the loan new")
    public void validateTheLoanNew() {
        USER.attemptsTo(ValidateNewLoan.withCustomerData());
    }
}
