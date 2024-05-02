package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_PASSWORD;
import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterInformation implements Task {
    private final String username;
    private final String password;
    public EnterInformation(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public static EnterInformation withCustomerData(String username,String password) {
        return instrumented(EnterInformation.class,username,password);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_USERNAME),
                SendKeys.of(username).into(INPUT_USERNAME),

                WaitUntil.the(INPUT_PASSWORD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_PASSWORD),
                SendKeys.of(password).into(INPUT_PASSWORD)
        );
    }
}
