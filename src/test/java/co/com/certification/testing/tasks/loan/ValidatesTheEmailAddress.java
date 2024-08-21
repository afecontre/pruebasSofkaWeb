package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.models.InformationSystem;
import co.com.certification.testing.questions.ObtainText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.loan.LoanPage.INPUT_BORROWER_FIRST_NAME;
import static co.com.certification.testing.pages.user.UserPage.BTN_CONFIRMED_ACTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.hamcrest.Matchers.containsString;

public class ValidatesTheEmailAddress implements Task {

    public ValidatesTheEmailAddress() {
    }

    public static ValidatesTheEmailAddress withCustomerData() {
        return instrumented(ValidatesTheEmailAddress.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        //Borrower Information
        actor.attemptsTo(
                Click.on(BTN_BORROWER_INFORMATION),
                Click.on(INPUT_BORROWER_EMAIL),
                SendKeys.of("rmechan").into(INPUT_BORROWER_EMAIL).thenHit(Keys.TAB)
        );

        actor.should(seeThat(ObtainText.element(LABEL_EMAIL_VALID),containsString("Please enter a valid email address.")).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT));
    }
}