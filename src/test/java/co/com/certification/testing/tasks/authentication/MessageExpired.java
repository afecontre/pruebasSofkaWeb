package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class MessageExpired implements Task {


    public MessageExpired() {
        //Nothing
    }

    public static MessageExpired withTheFollowingField() {
        return instrumented(MessageExpired.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        boolean homeVisible = WebElementQuestion.the(MESSAGE_EXPIRED).answeredBy(actor).isVisible();

        if (!homeVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOGIN)
            );
            boolean logoutVisible = WebElementQuestion.the(MESSAGE_EXPIRED).answeredBy(actor).isVisible();
            if (logoutVisible) {
                actor.attemptsTo(
                        Click.on(BTN_LOGIN)
                );
                boolean loginVisible = WebElementQuestion.the(MESSAGE_EXPIRED).answeredBy(actor).isVisible();
                if (loginVisible)
                    actor.attemptsTo(
                            Click.on(BTN_LOGIN)
                    );
                actor.attemptsTo(
                        WaitUntil.the(MESSAGE_EXPIRED, isEnabled()).forNoMoreThan(5).seconds()
                );
            }
        }
    }
}
