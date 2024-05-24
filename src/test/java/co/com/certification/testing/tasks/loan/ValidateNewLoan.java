package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.questions.ObtainText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.containsString;

public class ValidateNewLoan implements Task {

    public ValidateNewLoan() {
        //Nothing
    }

    public static ValidateNewLoan withCustomerData() {
        return instrumented(ValidateNewLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SECTION_LOAN)
        );

        actor.should(seeThat(ObtainText.element(LBL_LOAN_NUMBER),containsString(actor.recall("loan_number"))).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT));

    }
}
