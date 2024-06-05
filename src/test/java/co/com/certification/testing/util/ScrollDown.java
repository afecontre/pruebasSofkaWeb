package co.com.certification.testing.util;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollDown implements Task {

    private WebElementFacade button;

    public ScrollDown(WebElementFacade button) {
        this.button = button;
    }

    public static ScrollDown called(WebElementFacade button) {
        return new ScrollDown(button);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(button)
        );
    }
}
