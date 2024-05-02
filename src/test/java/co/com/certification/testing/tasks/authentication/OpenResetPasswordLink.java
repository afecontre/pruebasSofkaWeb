package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenResetPasswordLink implements Task {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenResetPasswordLink.class);
    private final String url;

    public OpenResetPasswordLink(String url) {
        this.url = url;
    }

    public static OpenResetPasswordLink the(String url) {
        return instrumented(OpenResetPasswordLink.class, url);
    }

    @Override
    @Step("{0} opens the reset password link")
    public <T extends Actor> void performAs(T actor) {

        LOGGER.debug("Opening URL: {}", url);
        actor.attemptsTo(Open.url(url));

    }
}
