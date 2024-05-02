package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.EMAIL_ANS_PASSWORD_INVALID;
import static co.com.certification.testing.pages.authentication.LoginPage.EMAIL_INVALID;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EmailAndPasswordInvalid implements Task {

    public EmailAndPasswordInvalid(){
    }

    public static EmailAndPasswordInvalid withTheFollowingField() {
        return instrumented(EmailAndPasswordInvalid.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL_ANS_PASSWORD_INVALID, isEnabled()).forNoMoreThan(5).seconds()
        );
    }
}
