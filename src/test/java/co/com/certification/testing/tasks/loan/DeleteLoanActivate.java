package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
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

public class DeleteLoanActivate implements Task {

    public DeleteLoanActivate() {
        //Nothing
    }

    public static DeleteLoanActivate withCustomerData() {
        return instrumented(DeleteLoanActivate.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        String number_loan = actor.recall("number_loan");

        final Target BTN_SELECTED= Target.the("Check Button")
                .located(By.xpath("//a[text()='" + number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label"));

        boolean loanVisible = WebElementQuestion.the(BTN_SELECTED).answeredBy(actor).isVisible();

        if (!loanVisible) {
            actor.attemptsTo(
                        Click.on(BTN_LOAN_TAB)
            );
            boolean loanVisible_2 = WebElementQuestion.the(BTN_SELECTED).answeredBy(actor).isVisible();
            if (loanVisible_2) {
                actor.attemptsTo(
                        Click.on(BTN_LOAN_TAB)
                );
            }
        }

        actor.attemptsTo(
                WaitUntil.the(BTN_SELECTED, isEnabled()).forNoMoreThan(4).seconds(),
                SetCheckbox.of(BTN_SELECTED).toTrue(),
                Click.on(BTN_ACTION),
                Click.on(BTN_DELETE_LOAN),
                Click.on(BTN_DELETE_CONFIRM),
                WaitUntil.the(LABEL_DELETE_LOAN, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BTN_SUCCESS_DELETE),
                Click.on(BTN_CLEAR_SEARCH_QUICK)
        );
    }
}
