package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectView implements Task {

    private final String view;
    public SelectView(String view) {
       //Nothing
        this.view = view;
    }
    public static SelectView withTheFollowingField(String view) {
        return instrumented(SelectView.class,view);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SELECT_VIEW, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SELECT_VIEW)
        );

        switch(view) {
            case "Day":
                actor.attemptsTo(
                        Click.on(BTN_DAY)
                );
                break;
            case "Week":
                actor.attemptsTo(
                        Click.on(BTN_WEEK)
                );
                break;
            case "Month":
                actor.attemptsTo(
                        Click.on(BTN_MONTH)
                );
                break;
            case "Quarter":
                actor.attemptsTo(
                        Click.on(BTN_QUARTER)
                );
                break;
            case "Year":
                actor.attemptsTo(
                        Click.on(BTN_YEAR)
                );
                break;
            default:
                System.out.println("Opción no reconocida");
        }

        actor.attemptsTo(
                Click.on(BTN_SEARCH)
        );
    }
}
