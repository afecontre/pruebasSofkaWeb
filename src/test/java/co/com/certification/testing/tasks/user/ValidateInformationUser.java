package co.com.certification.testing.tasks.user;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.questions.ObtainText;
import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.INPUT_ADVANCED;
import static co.com.certification.testing.pages.loan.LoanPage.LBL_TOTAL_REQUESTING;
import static co.com.certification.testing.pages.user.UserPage.*;
import static co.com.certification.testing.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class ValidateInformationUser implements Task {

    public ValidateInformationUser() {
        //Nothing
    }

    public static ValidateInformationUser withTheFollowingField() {
        return instrumented(ValidateInformationUser.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADVANCED_USER, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(INPUT_SEARCH_USER),
                SendKeys.of(FIRST_NAME).into(INPUT_SEARCH_USER),
                Hit.the(Keys.ENTER).into(INPUT_SEARCH_USER)
        );

        Pause.withDuration(2);

        actor.should(
                seeThat(ObtainText.element(LABEL_USER_NAME),containsString(FIRST_NAME)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT),
                seeThat(ObtainText.element(LABEL_ROLE_USER),containsString(ROLE)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT)
        );
    }
}
