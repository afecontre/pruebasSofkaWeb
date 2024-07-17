package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.models.InformationUrl;
import co.com.certification.testing.util.MoveMouseToPosition;
import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.user.UserPage.BTN_SYSTEM_USER;
import static co.com.certification.testing.pages.user.UserPage.BTN_USER_TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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

        final Target BTN_SELECTED= Target.the("Check Button")
                .located(By.xpath("//a[text()='" + number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label"));

        boolean loanVisible = WebElementQuestion.the(LBL_LOAN_NON_EXISTENT).answeredBy(actor).isVisible();

        if (!loanVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOAN_TAB),
                    Click.on(BTN_SEARCH_QUICK),
                    SendKeys.of(number_loan).into(BTN_SEARCH_QUICK).thenHit(Keys.ENTER)
            );
            boolean loanVisible_2 = WebElementQuestion.the(LBL_LOAN_NON_EXISTENT).answeredBy(actor).isVisible();
            if (loanVisible_2) {
                actor.attemptsTo(
                        Click.on(BTN_LOAN_TAB),
                        Click.on(BTN_SEARCH_QUICK),
                        SendKeys.of(number_loan).into(BTN_SEARCH_QUICK).thenHit(Keys.ENTER)
                );
            }
        }

        actor.attemptsTo(
                SetCheckbox.of(BTN_SELECTED).toTrue(),
                Click.on(BTN_ACTION),
                Click.on(BTN_ARCHIVE_LOAN),
                Click.on(BTN_CONFIRMED_LOAN),
                Click.on(BTN_SUCCESS_DELETE),
                Click.on(BTN_CLEAR_SEARCH_QUICK)
        );
    }
}
