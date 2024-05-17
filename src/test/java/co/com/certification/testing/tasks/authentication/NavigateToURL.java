package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class NavigateToURL implements Task {

    private final String url;

    public NavigateToURL(String url) {
        this.url = url;
    }

    public static NavigateToURL withCustomerData(String url) {
        return instrumented(NavigateToURL.class,url);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        String url_new=null;

        switch(url) {
            case "Loan":
                url_new="https://lg01.uat-landgorilla.com/clientV2/loan-manager/index";
                break;
            case "Dashboard":
                url_new="https://lg01.uat-landgorilla.com/clientV2/dashboard/home";
                break;
            default:
                System.out.println("Opción no reconocida");
        }
        actor.attemptsTo(
                Open.url(url_new));
    }
}
