package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class ForgotPasswordSteps {

    @When("the user clicks on the Forget Password option")
    public void theUserClicksOnTheForgetPasswordOption() {
        USER.attemptsTo(ForgotPass.withTheFollowingField());
    }

    @And("enters their email {string}")
    public void entersTheirEmail(String email) {
        USER.attemptsTo(EmailRecovery.withTheFollowingField(email));
    }

    @And("clicks the Identify button")
    public void clicksTheIdentifyButton() {
        USER.attemptsTo(IdentifyButton.withTheFollowingField());
    }

    @And("sees a valid recovery message")
    public void seesAValidRecoveryMessage() {
        USER.attemptsTo(MessageRecovery.withTheFollowingField());
    }

    @Then("valid email address")
    public void validEmailAddress() {
        //USER.attemptsTo(EmailInvalid.withTheFollowingField());
        USER.attemptsTo(EmailAndPasswordInvalid.withTheFollowingField());
    }

    @Then("the user should receive a password reset link")
    public void theUserShouldReceiveAPasswordResetLink() {
        USER.attemptsTo(ResetLink.withTheFollowingField());
    }

}
