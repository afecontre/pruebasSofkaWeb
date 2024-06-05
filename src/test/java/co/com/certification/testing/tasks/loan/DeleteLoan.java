package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import java.util.List;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class DeleteLoan implements Task {

    public DeleteLoan() {
        //Nothing
    }

    public static DeleteLoan withTheFollowingField() {
        return instrumented(DeleteLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        //delete loan
        List<String> loanNumbers = EnterInformationLoan.getGeneratedLoanNumbers();

        for (String loanNumber : loanNumbers) {
            actor.attemptsTo(
                    Click.on(By.xpath("//a[text()='"+ loanNumber + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
                    Click.on(BTN_ACTION),
                    Click.on(BTN_DELETE_LOAN),
                    Click.on(BTN_DELETE_CONFIRM),
                    WaitUntil.the(LABEL_DELETE_LOAN, isEnabled()).forNoMoreThan(4).seconds(),
                    Click.on(BTN_SUCCESS_DELETE)
            );
        }
        // Limpia la lista después de eliminar todos los préstamos
        EnterInformationLoan.getGeneratedLoanNumbers().clear();
    }
}
