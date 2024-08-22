package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

import static co.com.certification.testing.pages.authentication.LoginPage.*;

public class PageHome implements Task {

    public PageHome() {
    }

    public static PageHome withTheFollowingField() {
        return new PageHome();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean homeVisible = actor.asksFor(CurrentVisibility.of(HOME));
        if (!homeVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOGIN)
            );
        }
    }
}
