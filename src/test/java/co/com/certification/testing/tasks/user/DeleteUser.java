package co.com.certification.testing.tasks.user;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_SETPASSWORD;
import static co.com.certification.testing.pages.user.UserPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteUser implements Task {

    public DeleteUser() {
    }

    public static DeleteUser withTheFollowingField() {
        return new DeleteUser();
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CHECK_USER, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(BTN_CHECK_USER),
                Click.on(BTN_ACTION_USER),
                Click.on(BTN_DELETE_USER),
                Click.on(BTN_CONFIRM_DELETE_USER),
                Click.on(BTN_CONFIRMED_ACTION)
        );
    }
}
