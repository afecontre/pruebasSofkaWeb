package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.joda.time.Seconds;
import org.openqa.selenium.JavascriptExecutor;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SendMessages implements Task {

    public SendMessages() {
        //Nothing
    }

    public static SendMessages withCustomerData() {
        return instrumented(SendMessages.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACTION),
                Click.on(BTN_SEND_MESSAGES),
                Click.on(INPUT_TO_MESSAGE),
                Click.on(BTN_ITEM_SELECTED),
                Hit.the(Keys.TAB).into(INPUT_TO_MESSAGE),
                SendKeys.of("Correo de Prueba").into(INPUT_SUBJECT_MESSAGES),
                Hit.the(Keys.TAB).into(INPUT_SUBJECT_MESSAGES)
        );

        actor.attemptsTo(
                Click.on(BTN_SEND_EMAIL),
                Click.on(BTN_CONFIRM_ACTIVATE),
                Click.on(BTN_LOAN_TAB)
        );
    }
}
