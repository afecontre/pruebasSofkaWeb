package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FilterForDay implements Task {
    private final String period;

    public FilterForDay(String period) {
        this.period = period;
    }
    public static FilterForDay withTheFollowingField(String period) {
        return instrumented(FilterForDay.class,period);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PERIOD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_PERIOD)
        );
        if(period.equals("Today")){
            actor.attemptsTo(
                    Click.on(DAY_PERIOD)
            );
        }
        if(period.equals("Week")){
            actor.attemptsTo(
                    Click.on(WEEK_PERIOD)
            );
        }
        if(period.equals("Month")){
            actor.attemptsTo(
                    Click.on(MONTH_PERIOD)
            );
        }
        actor.attemptsTo(
                Click.on(BTN_SEARCH)
        );
    }
}
