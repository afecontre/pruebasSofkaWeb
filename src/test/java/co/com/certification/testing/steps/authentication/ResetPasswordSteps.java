package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class ResetPasswordSteps {
    @And("the user enter url")
    public void theUserEnterUrl() {
        USER.attemptsTo(
                NavigateToResetPassword.web());
    }

    @Then("the user should receive a password reset link")
    public void theUserShouldReceiveAPasswordResetLink() {
        USER.attemptsTo(ResetLink.withTheFollowingField());
    }

    @And("the user is on the application reset password")
    public void theUserIsOnTheApplicationResetPassword() {
        USER.attemptsTo(
                NavigateToResetPassword.web());
    }

    @Then("valid that the button is disabled")
    public void validThatTheButtonIsDisabled() {
        USER.attemptsTo(DisableButton.withTheFollowingField());
    }

//    @Then("the user should receive a {string}")
//    public void theUserShouldReceiveA(String type) {
//        USER.attemptsTo(ResetLink.withTheFollowingField(type));
//    }
}
