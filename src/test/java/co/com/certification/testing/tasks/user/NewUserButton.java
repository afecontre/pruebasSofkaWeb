package co.com.certification.testing.tasks.user;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.user.UserPage.BTN_NEW_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewUserButton implements Task {

    public NewUserButton() {
        //Nothing
    }

    public static NewUserButton withTheFollowingField() {
        return instrumented(NewUserButton.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEW_USER)
        );
    }
}
