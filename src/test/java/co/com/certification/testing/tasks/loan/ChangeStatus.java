package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.tasks.authentication.LoadLoanCSV;
import co.com.certification.testing.util.ElementEnabled;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ChangeStatus implements Task {

    public ChangeStatus() {
        //Nothing
    }

    public static ChangeStatus withCustomerData() {
        return instrumented(ChangeStatus.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOAN_STATUS),
                Click.on(BTN_ACTIVE_STATUS),
                Click.on(BTN_CHANGE_ACTIVATE)
        );


    }
}
