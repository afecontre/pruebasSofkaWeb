package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_LOAN_FILTER;
import static co.com.certification.testing.pages.authentication.LoginPage.BTN_SAVE_FILTER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLoanFilter implements Task {
    public SelectLoanFilter() {
       //Nothing
    }
    public static SelectLoanFilter withTheFollowingField() {
        return instrumented(SelectLoanFilter.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOAN_FILTER)
        );
    }
}
