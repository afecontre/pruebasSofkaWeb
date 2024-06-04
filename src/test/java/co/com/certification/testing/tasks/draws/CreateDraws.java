package co.com.certification.testing.tasks.draws;

import co.com.certification.testing.tasks.loan.EnterInformationLoan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
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
        //delete loan
        List<String> loanNumbers = EnterInformationLoan.getGeneratedLoanNumbers();

        for (String loanNumber : loanNumbers) {
            for (int i = 0; i < 3; i++) {
            actor.attemptsTo(
                    Click.on(By.xpath("//a[normalize-space()='"+ loanNumber + "']")),
                    Click.on(BTN_ACTION_DRAW),
                    Scroll.to(BTN_DRAW),
                    Click.on(BTN_FIRST_DRAW),
                    Click.on(BTN_FIRST_DRAW_PROCEED),
                    Click.on(BTN_SCHEDULING_APPOINTMENT_NOT_REQUIRED),
                    Click.on(By.xpath("//div[@class='inspection-scheduling']/span[text()='Monday']")),
                    Click.on(By.xpath("//div[@class='inspection-scheduling-inspection']//label[contains(text(),'Morning')]")),
                    Click.on(BTN_SAVE_INSPECTION_INFORMATION),

                    WaitUntil.the(LABEL_DELETE_LOAN, isEnabled()).forNoMoreThan(4).seconds(),
                    Click.on(BTN_SUCCESS_DELETE)
                );
            }
        }
        // Limpia la lista después de eliminar todos los préstamos
        EnterInformationLoan.getGeneratedLoanNumbers().clear();
    }
}
