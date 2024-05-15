package co.com.certification.testing.tasks.dashboard;

import co.com.certification.testing.tasks.authentication.DisableButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DashboardHome implements Task {
    public DashboardHome() {
        //Nothing
    }

    public static DashboardHome withTheFollowingFields() {
        return instrumented(DashboardHome.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOAN,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_ORDERS,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_CONTACTS,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_USERS,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_PROJECTS,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_HUD,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_PAYMENTS,isVisible()).forNoMoreThan(2).seconds(),
                WaitUntil.the(BTN_REPORTS,isVisible()).forNoMoreThan(2).seconds()
        );
    }
}
