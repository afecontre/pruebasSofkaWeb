package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.EnterInformation;
import co.com.certification.testing.tasks.authentication.LoginButton;
import co.com.certification.testing.tasks.authentication.NavigateTo;
import co.com.certification.testing.tasks.authentication.NavigateToResetPassword;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.certification.testing.pages.authentication.LoginPage.LOGIN;
import static co.com.certification.testing.steps.conf.Hooks.USER;

public class CommonSteps {
    private static boolean loggedIn = false;

    @Given("the user is on the application home page")
    public void theUserIsOnTheApplicationHomePage() {
        USER.attemptsTo(
                NavigateTo.web(),
                Ensure.that(LOGIN).isEnabled());
    }

    @Given("the user is on the application reset password")
    public void theUserIsOnTheApplicationResetPassword() {
        USER.attemptsTo(
                NavigateToResetPassword.web());
    }

    @Given("the user has logged in with username {string} and password {string}")
    public void theUserHasLoggedInWithAndOnApplicationHomePage(String username, String password) {
        if (!loggedIn) {
            USER.attemptsTo(
                    NavigateTo.web(),
                    Ensure.that(LOGIN).isEnabled(),
                    EnterInformation.withCustomerData(username, password),
                    LoginButton.withTheFollowingField()
            );
            loggedIn = true;
        }
    }
}
