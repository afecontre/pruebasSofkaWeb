package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class WarningMessageSelected implements Task {

    public WarningMessageSelected() {
        //Nothing
    }

    public static WarningMessageSelected withCustomerData() {
        return instrumented(WarningMessageSelected.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LABEL_VALIDATE_OPEN_LOAN, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BTN_SUCCESS_DELETE)
        );
    }
}
