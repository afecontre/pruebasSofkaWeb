package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectTheLoan implements Task {

    public SelectTheLoan() {
        //Nothing
    }

    public static SelectTheLoan withCustomerData() {
        return instrumented(SelectTheLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        String number_loan = actor.recall("number_loan");

        final Target BTN_SELECTED= Target.the("Check Button")
                .located(By.xpath("//a[text()='" + number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label"));

        actor.attemptsTo(
                WaitUntil.the(BTN_SELECTED, isEnabled()).forNoMoreThan(4).seconds(),
                SetCheckbox.of(BTN_SELECTED).toTrue()
        );
    }
}
