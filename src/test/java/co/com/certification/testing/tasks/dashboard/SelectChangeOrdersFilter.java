package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectChangeOrdersFilter implements Task {
    public SelectChangeOrdersFilter() {
       //Nothing
    }
    public static SelectChangeOrdersFilter withTheFollowingField() {
        return instrumented(SelectChangeOrdersFilter.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHANGE_ORDERS_FILTER)
        );
    }
}
