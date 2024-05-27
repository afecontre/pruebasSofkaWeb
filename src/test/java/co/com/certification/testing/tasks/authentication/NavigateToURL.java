package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.models.InformationUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


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
        actor.attemptsTo(
                Open.url(InformationUrl.getUatUrlDemoUrl() + url));
    }
}
