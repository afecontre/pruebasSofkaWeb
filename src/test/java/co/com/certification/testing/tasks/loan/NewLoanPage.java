package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class NewLoanPage implements Task {

    public NewLoanPage() {
    }

    public static NewLoanPage withTheFollowingField() {
        return new NewLoanPage();
    }
    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_NEW_LOAN_PAGE, isEnabled()).forNoMoreThan(6).seconds()
        );
    }
}
