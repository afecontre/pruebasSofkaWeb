package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SwitchToActiveLoan implements Task {

    public SwitchToActiveLoan() {
        //Nothing
    }

    public static SwitchToActiveLoan withCustomerData() {
        return instrumented(SwitchToActiveLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        String number_loan = actor.recall("number_loan");

        final Target BTN_SELECTED= Target.the("Check Button")
                .located(By.xpath("//td[text()='" + number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label"));

        boolean loanVisible = WebElementQuestion.the(BTN_SELECTED).answeredBy(actor).isVisible();

        if (!loanVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOAN_TAB),
                    Click.on(BTN_ACTION),
                    Click.on(BTN_VIEW_ARCHIVED),
                    Click.on(BTN_SEARCH_QUICK),
                    SendKeys.of(number_loan).into(BTN_SEARCH_QUICK)
            );
            boolean loanVisible_2 = WebElementQuestion.the(BTN_SELECTED).answeredBy(actor).isVisible();
            if (loanVisible_2) {
                actor.attemptsTo(
                        Click.on(BTN_LOAN_TAB),
                        Click.on(BTN_ACTION),
                        Click.on(BTN_VIEW_ARCHIVED),
                        Click.on(BTN_SEARCH_QUICK),
                        SendKeys.of(number_loan).into(BTN_SEARCH_QUICK)
                );
            }
        }

        actor.attemptsTo(
                SetCheckbox.of(BTN_SELECTED).toTrue(),
                Click.on(BTN_ACTION),
                Click.on(BTN_ACTIVATE_LOAN),
                Click.on(BTN_CONFIRMED_LOAN),
                Click.on(BTN_SUCCESS_DELETE)
        );
    }
}
