package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

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

        actor.attemptsTo(
                Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label"))
        );
    }
}
