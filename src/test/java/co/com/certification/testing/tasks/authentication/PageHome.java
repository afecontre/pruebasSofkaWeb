package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.ElementEnabled;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static co.com.certification.testing.pages.loan.LoanPage.BTN_NEW_LOAN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class PageHome implements Task {

    public PageHome() {
    }

    public static PageHome withTheFollowingField() {
        return new PageHome();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean homeVisible = WebElementQuestion.the(HOME).answeredBy(actor).isVisible();

        if (!homeVisible) {
            actor.attemptsTo(
                    Click.on(BTN_LOGIN)
            );
            boolean logoutVisible = WebElementQuestion.the(HOME).answeredBy(actor).isVisible();
            if (logoutVisible) {
                actor.attemptsTo(
                        Click.on(BTN_LOGIN)
                );
                boolean loginVisible = WebElementQuestion.the(HOME).answeredBy(actor).isVisible();
                if (loginVisible)
                    actor.attemptsTo(
                            Click.on(BTN_LOGIN)
                    );
            }
        }
    }
}
