package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import static userinterfaces.DemoblazePage.CONFIRM_PURCHASE_BUTTON;

public class CompletePurchase implements Task {

    public static CompletePurchase now() {
        return instrumented(CompletePurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CONFIRM_PURCHASE_BUTTON)
        );
    }
}
