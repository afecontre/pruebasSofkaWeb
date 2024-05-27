package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.USER_PASS_INVALIDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class LoginInvalid implements Task {


    public LoginInvalid() {
        //Nothing
    }

    public static LoginInvalid withTheFollowingField() {
        return instrumented(LoginInvalid.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_PASS_INVALIDO, isEnabled()).forNoMoreThan(5).seconds()
        );
    }

}
