package co.com.certification.testing.steps.loan;

import co.com.certification.testing.tasks.dashboard.ItemActivate;
import co.com.certification.testing.tasks.loan.EnterInformationLoan;
import co.com.certification.testing.tasks.loan.LoanHome;
import co.com.certification.testing.tasks.loan.NewLoanButton;
import co.com.certification.testing.tasks.loan.NewLoanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @And("valid New Loan page")
    public void validNewLoanPage() {
        USER.attemptsTo(NewLoanPage.withTheFollowingField());
    }

    @And("enter information the new Loan")
    public void enterInformationTheNewLoan() {
        USER.attemptsTo(EnterInformationLoan.withCustomerData());
    }
}
