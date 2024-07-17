package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RemoveSystemUser implements Task {

    public RemoveSystemUser() {
        //Nothing
    }

    public static RemoveSystemUser withCustomerData() {
        return instrumented(RemoveSystemUser.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_ACTION),
                Click.on(BTN_REMOVE_SYSTEM_USER),
                WaitUntil.the(INPUT_ADD_CONTACT, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(INPUT_ADD_CONTACT),
                SendKeys.of("Roberto").into(INPUT_ADD_CONTACT),
                Hit.the(Keys.ENTER).into(INPUT_ADD_CONTACT),
                SetCheckbox.of(BTN_USER_SELECTED_REMOVE).toTrue(),
                Click.on(BTN_SAVE_SYSTEM_USER),
                Click.on(BTN_CLEAR_SEARCH_QUICK)
        );
    }
}
