package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.models.InformationUrl;
import co.com.certification.testing.util.MoveMouseToPosition;
import co.com.certification.testing.util.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.user.UserPage.BTN_SYSTEM_USER;
import static co.com.certification.testing.pages.user.UserPage.BTN_USER_TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ArchiveLoan implements Task {

    public ArchiveLoan() {
        //Nothing
    }

    public static ArchiveLoan withCustomerData() {
        return instrumented(ArchiveLoan.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        String number_loan = actor.recall("number_loan");

//        actor.attemptsTo(
//                Click.on(BTN_CLEAR_SEARCH_QUICK),
//                Click.on(BTN_SEARCH_QUICK),
//                SendKeys.of(number_loan).into(BTN_SEARCH_QUICK),
//                Hit.the(Keys.ENTER).into(BTN_SEARCH_QUICK)
//                //Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
////                Click.on(BTN_ACTION),
////                Click.on(BTN_ARCHIVE_LOAN),
////                Click.on(BTN_CONFIRMED_LOAN),
////                Click.on(BTN_SUCCESS_DELETE),
//                //Click.on(BTN_CLEAR_SEARCH_QUICK)
//        );

        actor.attemptsTo(
//                Click.on(BTN_CLEAR_SEARCH_QUICK),
//                Click.on(BTN_SEARCH_QUICK),
//                SendKeys.of(number_loan).into(BTN_SEARCH_QUICK),
//                Hit.the(Keys.ENTER).into(BTN_SEARCH_QUICK),
                Click.on(By.xpath("//a[text()='"+ number_loan + "']/ancestor::tr/td[1]//div[@class='checkbox checkbox-primary text-center checkbox-loans']//label")),
                Click.on(BTN_ACTION),
                Click.on(BTN_ARCHIVE_LOAN),
                Click.on(BTN_CONFIRMED_LOAN),
                Click.on(BTN_SUCCESS_DELETE),
                Click.on(BTN_CLEAR_SEARCH_QUICK)
        );
    }
}
