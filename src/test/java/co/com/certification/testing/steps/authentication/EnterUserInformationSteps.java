package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.annotations.Test;

import java.io.IOException;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class EnterUserInformationSteps {
    @When("the user enter a name your user and a password")
    public void theUserEnterANameYourUserAndAPassword() throws IOException {
        USER.attemptsTo(EnterInformationCsv.withCustomerData());
    }
    @When("the user enter a name your user {string} and a password {string}")
    public void theUserEnterANameYourUserAndAPassword(String username, String password) {
        USER.attemptsTo(EnterInformation.withCustomerData(username,password));
    }
    @And("click on the Login button")
    public void clickOnTheLoginButton() {
        USER.attemptsTo(LoginButton.withTheFollowingField());
    }
    @Then("valid home page")
    public void validHomePage() {
        USER.attemptsTo(PageHome.withTheFollowingField());
    }
    @Then("valid that the login is invalid")
    public void validThatTheLoginIsInvalid() {
        USER.attemptsTo(EmailInvalid.withTheFollowingField());
    }
    @Then("valid that the login is invalid due to empty user")
    public void validThatTheLoginIsInvalidDueToEmptyUser() {
        USER.attemptsTo(EmailEmpty.withTheFollowingField());
    }
    @Then("valid that the login is invalid due to empty password")
    public void validThatTheLoginIsInvalidDueToEmptyPassword() {
        USER.attemptsTo(PasswordEmpty.withTheFollowingField());
    }

}
