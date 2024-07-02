package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.BTN_SEARCH_QUICK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QuickSearch_New implements Task {

    private final String number_loan;

    public QuickSearch_New(String number_loan) {
        this.number_loan = number_loan;
    }

    public static QuickSearch_New withTheFollowingField(String number_loan) {
        return instrumented(QuickSearch_New.class,number_loan);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH_QUICK),
                SendKeys.of(number_loan).into(BTN_SEARCH_QUICK)
        );
        Pause.withDuration(2);
        actor.remember("number_loan", number_loan);
    }
}
