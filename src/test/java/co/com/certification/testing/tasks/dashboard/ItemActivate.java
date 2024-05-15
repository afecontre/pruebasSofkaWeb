package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ItemActivate implements Task {
    public ItemActivate() {
        //Nothing
    }

    public static ItemActivate withTheFollowingFields() {
        return instrumented(ItemActivate.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_ORDER_ACTIVATE, isVisible()).forNoMoreThan(3).seconds(),
                WaitUntil.the(LABEL_ORDER_ACTIVATE_MONTH, isVisible()).forNoMoreThan(1).seconds(),
                WaitUntil.the(LABEL_ORDER_ACTIVATE_WEEK, isVisible()).forNoMoreThan(1).seconds());
    }
}
