package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class ExpiredPasswordSteps {

    @Then("valid expired message")
    public void validExpiredMessage() {
        USER.attemptsTo(MessageExpired.withTheFollowingField());
    }

    @And("user clicks to change update password")
    public void userClicksToChangeUpdatePassword() {
        USER.attemptsTo(ExpiredButton.withTheFollowingField());
    }

    @And("the user enter a new password {string}")
    public void theUserEnterANewPassword(String password) {
        USER.attemptsTo(InputResetPassword.withTheFollowingField(password));
    }
    @And("the user enters the password again {string}")
    public void theUserEntersThePasswordAgain(String password) {
        USER.attemptsTo(InputResetPasswordAgain.withTheFollowingField(password));
    }
    @And("click the Set The Password button")
    public void clickTheSetThePasswordButton() {
        USER.attemptsTo(SetThePasswordButton.withTheFollowingField());
    }

    @Then("valid reset message")
    public void validResetMessage() {
        USER.attemptsTo(MessageUpdate.withTheFollowingField());
    }
}
