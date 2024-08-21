package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterLoanEmptyPropertyInformation implements Task {

    private final String day;

    public EnterLoanEmptyPropertyInformation(String day) {
        this.day = day;
    }

    public static EnterLoanEmptyPropertyInformation withTheFollowingField(String day) {
        return instrumented(EnterLoanEmptyPropertyInformation.class,day);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Obligatory
                WaitUntil.the(INPUT_LOAN_NUMBER, isEnabled()).forNoMoreThan(6).seconds(),
                Click.on(INPUT_LOAN_NUMBER),
                SendKeys.of("BBC-001").into(INPUT_LOAN_NUMBER),
                Click.on(BTN_LOAN_TYPE),
                Click.on(By.xpath("//ul[@class='dropdown-menu inner']//li/a/span[text()='Conventional']")),
                Click.on(BTN_LOAN_PROGRAM),
                Click.on(By.xpath("//span[text()='LP01_Loans programs 01']")),
                Click.on(BTN_TRANSACTION_TABLE),
                Click.on(By.xpath("//span[text()='T005_Table 05']")),
                Click.on(BTN_LOAN_FUNDED_DATE),
                Click.on(By.xpath("//div[@class='datepicker-days']//th[@class='today'][normalize-space()='Today']")),
                Click.on(INPUT_TERM_DAY),
                SendKeys.of(day).into(INPUT_TERM_DAY),
                Click.on(BTN_PROPERTY_INFORMATION)
        );
    }
}
