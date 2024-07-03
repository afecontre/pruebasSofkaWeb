package co.com.certification.testing.tasks.dashboard;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FilterLoanMaturity implements Task {

    public FilterLoanMaturity() {
       //Nothing
    }
    public static FilterLoanMaturity withTheFollowingField() {
        return instrumented(FilterLoanMaturity.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        Pause.withDuration(5);
        actor.attemptsTo(
                WaitUntil.the(BTN_FILTERS_LOAN_MATURITY, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_FILTERS_LOAN_MATURITY)
        );
    }
}
