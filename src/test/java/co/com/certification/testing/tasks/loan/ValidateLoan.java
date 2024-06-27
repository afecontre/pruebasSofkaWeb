package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.questions.ObtainText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.user.UserPage.BTN_SYSTEM_USER;
import static co.com.certification.testing.pages.user.UserPage.BTN_USER_TAB;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class ValidateLoan implements Task {

    public ValidateLoan() {
        //Nothing
    }

    public static ValidateLoan withCustomerData() {
        return instrumented(ValidateLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        //actor.should(seeThat(ObtainText.element(LBL_LOAN_NUMBER),containsString(actor.recall("number_loan"))).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT));

     actor.attemptsTo(
             WaitUntil.the(By.xpath("//a[normalize-space()='" + actor.recall("number_loan") + "']"), isVisible()).forNoMoreThan(8).seconds(),
             Click.on(BTN_CLEAR_SEARCH_QUICK)
             );
    }
}
