package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicksOpenLoan implements Task {

    public ClicksOpenLoan() {
        //Nothing
    }

    public static ClicksOpenLoan withCustomerData() {
        return instrumented(ClicksOpenLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACTION),
                Click.on(BTN_OPEN_LOAN)
        );
    }
}
