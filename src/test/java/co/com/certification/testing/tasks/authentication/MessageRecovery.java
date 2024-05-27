package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.MESSAGE_RECOVERY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class MessageRecovery implements Task {


    public MessageRecovery() {
        //Nothing
    }

    public static MessageRecovery withTheFollowingField() {
        return instrumented(MessageRecovery.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MESSAGE_RECOVERY, isEnabled()).forNoMoreThan(20).seconds()
        );
    }

}
