package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FilterBy implements Task {

    private final String period;
    public FilterBy(String period) {
       //Nothing
        this.period = period;
    }
    public static FilterBy withTheFollowingField(String period) {
        return instrumented(FilterBy.class,period);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FILTER_BY));

        switch(period) {
            case "Loan Type":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_LOAN_TYPE)
                );
                break;
            case "System User":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_SYSTEM_USER)
                );
                break;
            case "Product Ordered":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_PRODUCT_ORDERED)
                );
                break;
            case "Order Status":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_ORDER_STATUS)
                );
                break;
            case "Loan Program":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_LOAN_PROGRAM)
                );
                break;
            case "Investor":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_INVESTOR)
                );
                break;
            case "Transaction Table":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_TRANSACTION_TABLE)
                );
                break;
            case "Last Activity":
                actor.attemptsTo(
                        Click.on(BTN_FILTERS_LAST_ACTIVITY),
                        Click.on(BTN_SELECT_LAST_ACTIVITY)
                );
                break;
            default:
                System.out.println("Opción no reconocida");
        }
    }
}
