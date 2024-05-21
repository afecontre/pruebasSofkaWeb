package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class LoanHome implements Task {

    public LoanHome() {
    }

    public static LoanHome withTheFollowingField() {
        return new LoanHome();
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW_LOAN, isEnabled()).forNoMoreThan(10).seconds()
        );
    }
}
