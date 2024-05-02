package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class PageHome implements Task {

    public PageHome() {
    }

    public static PageHome withTheFollowingField() {
        return new PageHome();
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(Visibility.of(HOME))) {
            WaitUntil.the(HOME,isEnabled()).forNoMoreThan(5).seconds();
        } else {
            actor.attemptsTo(Click.on(BTN_LOGIN));
        }
    }
}
