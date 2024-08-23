package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class LoginButton implements Task {

    public LoginButton() {
        //Nothing
    }

    public static LoginButton withTheFollowingField() {
        return instrumented(LoginButton.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_LOGIN)
        );
    }
}
