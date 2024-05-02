package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.PASSWORD_EMPTY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class PasswordEmpty implements Task {


    public PasswordEmpty() {
        //Nothing
    }

    public static PasswordEmpty withTheFollowingField() {
        return instrumented(PasswordEmpty.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PASSWORD_EMPTY, isEnabled()).forNoMoreThan(5).seconds()
        );
    }
}
