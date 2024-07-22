package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectedLoans implements Task {

    public SelectedLoans() {
        //Nothing
    }

    public static SelectedLoans withCustomerData() {
        return instrumented(SelectedLoans.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOAN_1),
                Click.on(BTN_LOAN_2)
        );
    }
}
