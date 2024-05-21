package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.ElementEnabled;
import co.com.certification.testing.util.Pause;
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
        Boolean elementVisible = actor.asksFor(ElementEnabled.forTarget(HOME));
        if (elementVisible) {
            actor.attemptsTo(WaitUntil.the(HOME, isEnabled()).forNoMoreThan(10).seconds());
        } else {
            actor.attemptsTo(Click.on(BTN_LOGIN));
        }
    }
}
