package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.questions.ObtainText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.hamcrest.Matchers.containsString;

public class DownloadTemplate implements Task {

    public DownloadTemplate() {
        //Nothing
    }

    public static DownloadTemplate withCustomerData() {
        return instrumented(DownloadTemplate.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ACTION),
                Click.on(BTN_POST_TRANSACTIONS),
                //Click.on(BTN_DOWNLOAD_TEMPLATE)
                Click.on(BTN_DOWNLOAD_TEMPLATE));
    }
}
