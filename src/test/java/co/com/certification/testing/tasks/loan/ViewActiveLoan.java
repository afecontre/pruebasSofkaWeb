package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ViewActiveLoan implements Task {

    public ViewActiveLoan() {
        //Nothing
    }

    public static ViewActiveLoan withCustomerData() {
        return instrumented(ViewActiveLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_ACTION),
                Click.on(BTN_VIEW_ACTIVATE)
        );
    }
}
