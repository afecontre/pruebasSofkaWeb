package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.user.UserPage.BTN_SYSTEM_USER;
import static co.com.certification.testing.pages.user.UserPage.BTN_USER_TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class QuickSearch implements Task {

    private final String number_loan;

    public QuickSearch(String number_loan) {
        this.number_loan = number_loan;
    }

    public static QuickSearch withTheFollowingField(String number_loan) {
        return instrumented(QuickSearch.class,number_loan);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH_QUICK),
                SendKeys.of(number_loan).into(BTN_SEARCH_QUICK),
                Hit.the(Keys.ENTER).into(BTN_SEARCH_QUICK)
        );
        actor.remember("number_loan", number_loan);
    }
}
