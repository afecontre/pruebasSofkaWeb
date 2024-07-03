package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static co.com.certification.testing.pages.loan.LoanPage.INPUT_PAYEE_1;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLastActivityTime implements Task {

    private final String day;

    public SelectLastActivityTime(String day) {
        this.day = day;
    }

    public static SelectLastActivityTime withTheFollowingField(String day) {
        return instrumented(SelectLastActivityTime.class,day);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LAST_ACTIVITY),
                Hit.the(Keys.ARROW_DOWN).into(BTN_LAST_ACTIVITY),
                Hit.the(Keys.ARROW_DOWN).into(BTN_LAST_ACTIVITY),
                Hit.the(Keys.ENTER).into(BTN_LAST_ACTIVITY),
                Click.on(BTN_SAVE_FILTER)
        );
    }
}
