package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_NEW_PASSWORD_AGAIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class InputResetPasswordAgain implements Task {
    private final String password;
    public InputResetPasswordAgain(String password) {
        this.password = password;
    }

    public static InputResetPasswordAgain withTheFollowingField(String password) {
        return instrumented(InputResetPasswordAgain.class,password);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_NEW_PASSWORD_AGAIN, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_NEW_PASSWORD_AGAIN),
                SendKeys.of(password).into(INPUT_NEW_PASSWORD_AGAIN)
        );
    }
}
