package co.com.certification.testing.tasks.user;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static co.com.certification.testing.pages.user.UserPage.*;
import static co.com.certification.testing.util.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterNewPassword implements Task {

    private final String password;

    public EnterNewPassword(String password) {
        this.password = password;
    }

    public static EnterNewPassword withCustomerData(String password) {
        return instrumented(EnterNewPassword.class,password);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_PASSWORD_USER),
                SendKeys.of(password).into(INPUT_PASSWORD_USER),
                SendKeys.of(password).into(INPUT_PASSWORD_USER_CONFIRM),

                WaitUntil.the(BTN_SAVE_CHANGES, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SAVE_CHANGES),

                WaitUntil.the(BTN_TIME_ZONE, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_TIME_ZONE),
                Click.on(BTN_TIME_ZONE_PACIF),

                WaitUntil.the(BTN_SAVE_CHANGES_INFORMATION, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SAVE_CHANGES_INFORMATION),

                WaitUntil.the(BTN_USER_TAB, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_USER_TAB),
                Click.on(BTN_SYSTEM_USER)
        );
    }
}
