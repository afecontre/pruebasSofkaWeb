package co.com.certification.testing.tasks.user;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_PASSWORD;
import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static co.com.certification.testing.pages.user.UserPage.*;
import static co.com.certification.testing.util.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterNewAccount implements Task {

    private final String email;


    public EnterNewAccount(String email) {
        this.email = email;
    }

    public static EnterNewAccount withCustomerData(String email) {
        return instrumented(EnterNewAccount.class,email);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        String password_new =actor.recall("password_new");
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isEnabled()).forNoMoreThan(8).seconds(),
                SendKeys.of(email).into(INPUT_USERNAME),
                SendKeys.of(password_new).into(INPUT_PASSWORD)
        );
    }
}
