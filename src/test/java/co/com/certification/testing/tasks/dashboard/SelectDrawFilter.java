package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDrawFilter implements Task {

    public SelectDrawFilter() {
       //Nothing
    }
    public static SelectDrawFilter withTheFollowingField() {
        return instrumented(SelectDrawFilter.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DRAW_FILTER)
        );
    }
}
