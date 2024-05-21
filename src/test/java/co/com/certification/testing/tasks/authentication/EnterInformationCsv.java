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

public class EnterInformationCsv implements Task {

    private static final String RUTA_ARCHIVO_CSV = "C:\\Users\\Owner\\Documents\\auto_landgorilla\\qa-automation-suite\\src\\test\\resources\\data\\users.csv";

    private final String user;

    public EnterInformationCsv(String user) {
        this.user = user;
    }

    public static EnterInformationCsv withCustomerData(String user) {
        return instrumented(EnterInformationCsv.class,user);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoadUsersCSV.withTheFollowingField(RUTA_ARCHIVO_CSV)
        );

//        String username = actor.recall("username");
//        String password =  actor.recall("password");

        String username = null;
        String password = null;

        switch (user.toLowerCase()) {
            case "admin":
                username = actor.recall("admin_username");
                password = actor.recall("admin_password");
                break;
            case "sub":
                username = actor.recall("sub_username");
                password = actor.recall("sub_password");
                break;
            case "reset":
                username = actor.recall("reset_username");
                password = actor.recall("reset_password");
                break;
            case "blocked":
                username = actor.recall("blocked_username");
                password = actor.recall("blocked_password");
                break;
            default:
                throw new IllegalArgumentException("Unrecognized user type: " + user);
        }

        if (username != null && password != null) {

        actor.attemptsTo(
                LoadUsersCSV.withTheFollowingField(RUTA_ARCHIVO_CSV),
                WaitUntil.the(INPUT_USERNAME, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_USERNAME),
                SendKeys.of(username).into(INPUT_USERNAME),

                WaitUntil.the(INPUT_PASSWORD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INPUT_PASSWORD),
                SendKeys.of(password).into(INPUT_PASSWORD)
            );
        }
    }
}
