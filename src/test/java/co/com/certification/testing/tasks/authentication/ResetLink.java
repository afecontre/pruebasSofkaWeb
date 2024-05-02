package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_PASSWORD;
import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ResetLink implements Task {
    public ResetLink() {
    }

    public static ResetLink withTheFollowingField() {
        return instrumented(ResetLink.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        String email = actor.recall("email");
        Assert.assertNotNull("Email has not been set or recalled correctly", email);

        try {
            // Replace with smart waits to check for new email arrival if possible
            Thread.sleep(5000); // Wait a bit for the email to arrive
            actor.attemptsTo(RetrievePasswordResetLink.forEmail(email));

            String resetLink = actor.recall("resetLink");
            Thread.sleep(5000);
            Assert.assertNotNull("No reset link was retrieved", resetLink);
            Assert.assertFalse("Reset link is empty", resetLink.trim().isEmpty());

            // Wait until the browser potentially redirects and the final URL is loaded

            // Get the current URL from the browser and assert it's the expected reset link
            actor.attemptsTo(OpenResetPasswordLink.the(resetLink));
            Thread.sleep(5000); // Replace with smart waits if possible
            String currentUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
            Assert.assertTrue("The URL did not navigate to the reset link as expected.", currentUrl.equals(resetLink));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            Assert.fail("Thread was interrupted: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace(); // Logging the error to understand what went wrong
            Assert.fail("An error occurred during password reset link retrieval: " + e.getMessage());
        }

    }
}
