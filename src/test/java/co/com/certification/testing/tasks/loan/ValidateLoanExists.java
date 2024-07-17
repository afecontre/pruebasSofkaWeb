package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_LOGIN;
import static co.com.certification.testing.pages.authentication.LoginPage.HOME;
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

        String number_loan = actor.recall("number_loan");

        boolean loanVisible = WebElementQuestion.the(LBL_LOAN_NON_EXISTENT).answeredBy(actor).isVisible();

        if (!loanVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOAN_TAB),
                    Click.on(BTN_SEARCH_QUICK),
                    SendKeys.of(number_loan).into(BTN_SEARCH_QUICK)
            );
            boolean loanVisible_2 = WebElementQuestion.the(LBL_LOAN_NON_EXISTENT).answeredBy(actor).isVisible();
            if (loanVisible_2) {
                actor.attemptsTo(
                        Click.on(BTN_LOAN_TAB),
                        Click.on(BTN_SEARCH_QUICK),
                        SendKeys.of(number_loan).into(BTN_SEARCH_QUICK)
                );
            }
        }
        actor.attemptsTo(
            Click.on(BTN_CLEAR_SEARCH_QUICK));
    }
}
