package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class WarningMessageSelectedLoans implements Task {

    public WarningMessageSelectedLoans() {
        //Nothing
    }

    public static WarningMessageSelectedLoans withCustomerData() {
        return instrumented(WarningMessageSelectedLoans.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LABEL_VALIDATE_OPEN_LOANS, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BTN_SUCCESS_DELETE),
                Click.on(BTN_LOAN_1),
                Click.on(BTN_LOAN_2)
        );
    }
}
