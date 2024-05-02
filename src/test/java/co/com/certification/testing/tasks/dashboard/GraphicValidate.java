package co.com.certification.testing.tasks.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.authentication.LoginPage.LABEL_GRAPHIC_VALIDATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GraphicValidate implements Task {


    public GraphicValidate() {
        //Nothing
    }

    public static GraphicValidate withTheFollowingField() {
        return instrumented(GraphicValidate.class);
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_GRAPHIC_VALIDATE, isEnabled()).forNoMoreThan(5).seconds()
        );
    }
}
