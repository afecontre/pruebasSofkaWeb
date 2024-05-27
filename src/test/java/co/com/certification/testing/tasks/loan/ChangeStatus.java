package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChangeStatus implements Task {

    public ChangeStatus() {
        //Nothing
    }

    public static ChangeStatus withCustomerData() {
        return instrumented(ChangeStatus.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOAN_STATUS, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_LOAN_STATUS),
                Click.on(BTN_ACTIVE_STATUS),
                Click.on(BTN_CHANGE_ACTIVATE)
        );
    }
}
