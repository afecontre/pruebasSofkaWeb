package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.models.InformationUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ArchiveLoan implements Task {

    public ArchiveLoan() {
        //Nothing
    }

    public static ArchiveLoan withCustomerData() {
        return instrumented(ArchiveLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        String number_loan = actor.recall("number_loan");

        actor.attemptsTo(
                Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
                Click.on(BTN_ACTION),
                Click.on(BTN_ARCHIVE_LOAN),
                Click.on(BTN_CONFIRMED_LOAN),
                Click.on(BTN_SUCCESS_DELETE),
                Open.url(InformationUrl.getUatUrlLoanDemoUrl()));
    }
}
