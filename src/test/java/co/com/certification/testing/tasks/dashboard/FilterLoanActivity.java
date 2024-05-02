package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FilterLoanActivity implements Task {

    public FilterLoanActivity() {
       //Nothing
    }
    public static FilterLoanActivity withTheFollowingField() {
        return instrumented(FilterLoanActivity.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_FILTERS_LOAN_ACTIVITY, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_FILTERS_LOAN_ACTIVITY)
        );
    }
}
