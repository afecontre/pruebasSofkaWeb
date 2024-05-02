package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_IDENTIFY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IdentifyButton implements Task {


    public IdentifyButton() {
        //Nothing
    }

    public static IdentifyButton withTheFollowingField() {
        return instrumented(IdentifyButton.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_IDENTIFY, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_IDENTIFY)
        );
    }
}
