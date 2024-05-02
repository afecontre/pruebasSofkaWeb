package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.FORGOT_PASS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ForgotPass implements Task {
    public ForgotPass() {
        //Nothing
    }

    public static ForgotPass withTheFollowingField() {
        return instrumented(ForgotPass.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FORGOT_PASS, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(FORGOT_PASS)
        );
    }
}
