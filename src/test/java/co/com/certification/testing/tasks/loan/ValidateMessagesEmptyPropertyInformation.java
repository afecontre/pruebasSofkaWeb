package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.user.UserPage.BTN_CONFIRMED_ACTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ValidateMessagesEmptyPropertyInformation implements Task {

    public ValidateMessagesEmptyPropertyInformation() {
    }

    public static ValidateMessagesEmptyPropertyInformation withCustomerData() {
        return instrumented(ValidateMessagesEmptyPropertyInformation.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_ADDRESS_REQUIRED, isEnabled()).forNoMoreThan(2).seconds(),
                WaitUntil.the(LABEL_ZIP_REQUIRED, isEnabled()).forNoMoreThan(2).seconds(),
                WaitUntil.the(LABEL_CITY_REQUIRED, isEnabled()).forNoMoreThan(2).seconds(),
                WaitUntil.the(LABEL_STATE_REQUIRED, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(BTN_CONFIRMED_ACTION)
        );
    }
}