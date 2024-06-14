package co.com.certification.testing.tasks.user;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_LOGIN;
import static co.com.certification.testing.pages.user.UserPage.BTN_NEW_USER;

public class UserHome implements Task {

    public UserHome() {
    }

    public static UserHome withTheFollowingField() {
        return new UserHome();
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {

        boolean homeVisible = WebElementQuestion.the(BTN_NEW_USER).answeredBy(actor).isEnabled();

        if (!homeVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOGIN)
            );
            boolean logoutVisible = WebElementQuestion.the(BTN_NEW_USER).answeredBy(actor).isVisible();
            if (logoutVisible) {
                actor.attemptsTo(
                        Click.on(BTN_LOGIN)
                );
                boolean loginVisible = WebElementQuestion.the(BTN_NEW_USER).answeredBy(actor).isVisible();
                if (loginVisible)
                    actor.attemptsTo(
                            Click.on(BTN_LOGIN)
                    );
            }
        }
    }
}
