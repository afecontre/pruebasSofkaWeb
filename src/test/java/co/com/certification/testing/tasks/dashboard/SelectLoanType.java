package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.dashboard.DashboardPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLoanType implements Task {

    private final String type_loan;
    public SelectLoanType(String type_loan) {
        this.type_loan = type_loan;
    }
    public static SelectLoanType withTheFollowingField(String type_loan) {
        return instrumented(SelectLoanType.class,type_loan);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the(type_loan)
                .located(By.xpath("//label[contains(text(),'" + type_loan + "')]"))
                ),
                Click.on(BTN_SAVE_FILTER)
        );
    }
}
