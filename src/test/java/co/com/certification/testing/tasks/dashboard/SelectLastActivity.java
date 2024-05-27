package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLastActivity implements Task {

    private final String time;

    public SelectLastActivity(String time) {
       //Nothing
        this.time = time;
    }

    public static SelectLastActivity withTheFollowingField(String time) {
        return instrumented(SelectLastActivity.class,time);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Target.the(time)
                .located(By.xpath("//span[text() = '" + time + "']"))),
                Click.on(BTN_SAVE_FILTER)
        );
    }
}
