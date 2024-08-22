package co.com.certification.testing.tasks.loan;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.BTN_LOGIN;
import static co.com.certification.testing.pages.authentication.LoginPage.HOME;
import static co.com.certification.testing.pages.loan.LoanPage.*;
import static java.nio.file.Files.find;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoanHome implements Task {

    public LoanHome() {
    }

    public static LoanHome withTheFollowingField() {
        return new LoanHome();
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        boolean homeVisible = actor.asksFor(CurrentVisibility.of(HOME));
            if (!homeVisible) {
                actor.attemptsTo(
                        Click.on(BTN_LOGIN)
                );
            }
    }
}

