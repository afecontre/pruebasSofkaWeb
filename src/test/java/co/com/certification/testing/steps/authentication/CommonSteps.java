package co.com.certification.testing.steps.authentication;

import co.com.certification.testing.tasks.authentication.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Screenshots;

import static co.com.certification.testing.pages.authentication.LoginPage.LOGIN;
import static co.com.certification.testing.steps.conf.Hooks.USER;

public class CommonSteps {

    private static boolean loggedIn = false;

    @Given("the user is on the application home page {string}")
    public void theUserIsOnTheApplicationHomePage(String arg0) {
        USER.attemptsTo(
                NavigateTo.web());
    }



    @Given("the user has logged in with username {string} in {string}")
    public void theUserHasLoggedInWithUsernameIn(String user, String url) {
        if (!loggedIn) {
            USER.attemptsTo(
                    NavigateToURL.withCustomerData(url),
                    Ensure.that(LOGIN).isEnabled(),
                    UserLoginTest.withCustomerData(user),
                    LoginButton.withTheFollowingField()
            );
            loggedIn = true;
        }
    }

    @And("the user clicks on logout")
    public void theUserClicksOnLogout() {
        USER.attemptsTo(
                Logout.withTheFollowingField());
        loggedIn = false;
    }

    @And("ingresa al dashboard {string}")
    public void ingresaAlDashboard(String url) {
        USER.attemptsTo(
                NavigateToURL.withCustomerData(url));
    }


}
