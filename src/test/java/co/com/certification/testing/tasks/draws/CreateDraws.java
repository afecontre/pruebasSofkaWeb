package co.com.certification.testing.tasks.draws;

import co.com.certification.testing.models.InformationUrl;
import co.com.certification.testing.tasks.loan.EnterInformationLoan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import java.util.List;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CreateDraws implements Task {

    public CreateDraws() {
        //Nothing
    }

    public static CreateDraws withTheFollowingField() {
        return instrumented(CreateDraws.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        //create draws
        List<String> loanNumbers = EnterInformationLoan.getGeneratedLoanNumbers();

        for (String loanNumber : loanNumbers) {
            actor.attemptsTo(
                    Click.on(By.xpath("//a[normalize-space()='"+ loanNumber + "']")));

            actor.attemptsTo(
                    Click.on(BTN_ACTION_DRAW),
                    MoveMouse.to(BTN_DRAW),
                    Click.on(BTN_FIRST_DRAW),
                    WaitUntil.the(BTN_FIRST_DRAW_PROCEED, isEnabled()).forNoMoreThan(10).seconds(),
                    Click.on(BTN_FIRST_DRAW_PROCEED),
                    Click.on(BTN_SCHEDULING_APPOINTMENT_NOT_REQUIRED),
                    Click.on(By.xpath("//div[@class='inspection-scheduling']/span[text()='Monday']")),
                    Click.on(By.xpath("//div[@class='inspection-scheduling-inspection']//label[contains(text(),'Morning')]")),
                    Click.on(BTN_SAVE_INSPECTION_INFORMATION)

                );

            for (int i = 0; i < 2; i++) {
                actor.attemptsTo(
                        Open.url(InformationUrl.getUatUrlLoanDemoUrl()),
                        Click.on(By.xpath("//a[normalize-space()='"+ loanNumber + "']")),
                        Click.on(BTN_ACTION_DRAW),
                        MoveMouse.to(BTN_DRAW),
                        Click.on(BTN_FIRST_DRAW),
                        Click.on(BTN_FIRST_DRAW_PROCEED),
                        Click.on(BTN_SCHEDULING_APPOINTMENT_NOT_REQUIRED),
                        Click.on(By.xpath("//div[@class='inspection-scheduling']/span[text()='Monday']")),
                        Click.on(By.xpath("//div[@class='inspection-scheduling-inspection']//label[contains(text(),'Morning')]")),
                        DoubleClick.on(BTN_SAVE_INSPECTION_INFORMATION)
                 );
                }
            actor.attemptsTo(
                    Open.url(InformationUrl.getUatUrlLoanDemoUrl()));
            }
        }
}
