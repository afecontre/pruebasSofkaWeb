package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.EMAIL_RECOVERY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EmailRecovery implements Task {

    private final String email;

    public EmailRecovery(String email) {
        this.email = email;
    }

    public static EmailRecovery withTheFollowingField(String email) {
        return instrumented(EmailRecovery.class, email);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL_RECOVERY, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(EMAIL_RECOVERY),
                SendKeys.of(email).into(EMAIL_RECOVERY));

        String email_remember = "rmechan@landgorilla.com";
        actor.remember("email", email_remember);
    }
}
