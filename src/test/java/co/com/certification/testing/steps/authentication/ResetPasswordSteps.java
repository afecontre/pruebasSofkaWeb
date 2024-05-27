package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class ResetPasswordSteps {
    @And("the user enter url")
    public void theUserEnterUrl() {
        USER.attemptsTo(
                NavigateToResetPassword.web());
    }

    @Then("valid that the button is disabled")
    public void validThatTheButtonIsDisabled() {
        USER.attemptsTo(DisableButton.withTheFollowingField());
    }
}
