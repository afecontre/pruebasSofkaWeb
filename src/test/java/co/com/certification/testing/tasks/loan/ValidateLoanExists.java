package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateLoanExists implements Task {

    public ValidateLoanExists() {
        //Nothing
    }

    public static ValidateLoanExists withCustomerData() {
        return instrumented(ValidateLoanExists.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             WaitUntil.the(LBL_LOAN_NON_EXISTENT, isVisible()).forNoMoreThan(8).seconds(),
             Click.on(BTN_CLEAR_SEARCH_QUICK));
    }
}
