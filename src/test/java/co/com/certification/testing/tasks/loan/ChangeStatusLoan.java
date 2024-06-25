package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeStatusLoan implements Task {

    private final String status;

    public ChangeStatusLoan(String status) {
        this.status = status;
    }

    public static ChangeStatusLoan withCustomerData(String status) {
        return instrumented(ChangeStatusLoan.class,status);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        String number_loan = actor.recall("number_loan");

        actor.attemptsTo(
                Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
                Click.on(BTN_ACTION),
                Click.on(BTN_CHANGE_STATUS),
                Click.on(BTN_STATUS)
        );

        final Target BTN_CHANGE = Target.the("Change Status")
                .located(By.xpath("//a[@role='option']//span[contains(@class, 'text') and text()='" + status + "']"));


        actor.attemptsTo(
                Click.on(BTN_CHANGE),
                Click.on(BTN_CONFIRMED_CHANGE),
                Click.on(BTN_SUCCESS_DELETE)
        );
    }
}
