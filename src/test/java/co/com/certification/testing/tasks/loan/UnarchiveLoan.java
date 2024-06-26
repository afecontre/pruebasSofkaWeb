package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class UnarchiveLoan implements Task {

    public UnarchiveLoan() {
        //Nothing
    }

    public static UnarchiveLoan withCustomerData() {
        return instrumented(UnarchiveLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_ACTION),
                Click.on(BTN_VIEW_ARCHIVED)
        );

        String number_loan = actor.recall("number_loan");

        actor.attemptsTo(
                Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
                Click.on(BTN_ACTION),
                Click.on(BTN_DELETE_LOAN),
                Click.on(BTN_DELETE_CONFIRM),
                WaitUntil.the(LABEL_DELETE_LOAN, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BTN_SUCCESS_DELETE)
        );
    }
}
