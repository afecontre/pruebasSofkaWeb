package co.com.certification.testing.tasks.user;


import co.com.certification.testing.util.ScrollById;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.user.UserPage.*;
import static co.com.certification.testing.util.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterInformationUser  implements Task {

    private final String email;

    public EnterInformationUser(String email) {
        this.email = email;
    }

    public static EnterInformationUser withCustomerData(String email) {
        return instrumented(EnterInformationUser.class,email);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_EMAIL_USER),
                SendKeys.of(email).into(INPUT_EMAIL_USER),
                Click.on(INPUT_FIRST_NAME_USER),
                SendKeys.of(FIRST_NAME).into(INPUT_FIRST_NAME_USER),
                Click.on(INPUT_LAST_NAME_USER),
                SendKeys.of(LAST_NAME).into(INPUT_LAST_NAME_USER),
                Click.on(INPUT_TITLE_USER),
                SendKeys.of(TITLE).into(INPUT_TITLE_USER),
                Click.on(INPUT_PHONE_USER),
                SendKeys.of(PHONE_NUMBER).into(INPUT_PHONE_USER),
                Click.on(BTN_SELECT_ROLE_USER),
                //Click.on(BTN_ROLE_USER),
                Click.on(By.xpath("//select[@id='cbRole']/option[text()='" + ROLE + "']\n")),
                Scroll.to(BTN_SAVE_USER),
                Click.on(BTN_SAVE_USER),
                Click.on(BTN_CONFIRMED_ACTION)
        );
        String email_remember = "rmechan@landgorilla.com";
        actor.remember("email", email_remember);
    }
}
