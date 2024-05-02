package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import javax.swing.*;

import static co.com.certification.testing.pages.authentication.LoginPage.EMAIL_RECOVERY;
import static co.com.certification.testing.pages.authentication.LoginPage.MESSAGE_RECOVERY;
import static co.com.certification.testing.steps.conf.Hooks.USER;
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
