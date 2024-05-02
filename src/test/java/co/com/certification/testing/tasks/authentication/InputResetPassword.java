package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_NEW_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class InputResetPassword implements Task {
    private final String password;
    public InputResetPassword(String password) {
        this.password = password;
    }

    public static InputResetPassword withTheFollowingField(String password) {
        return instrumented(InputResetPassword.class,password);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_NEW_PASSWORD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_NEW_PASSWORD),
                SendKeys.of(password).into(INPUT_NEW_PASSWORD)
        );
    }
}
