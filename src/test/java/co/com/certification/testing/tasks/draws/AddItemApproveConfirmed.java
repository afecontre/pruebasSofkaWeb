package co.com.certification.testing.tasks.draws;

import co.com.certification.testing.exceptions.NotFoundText;
import co.com.certification.testing.models.InformationUrl;
import co.com.certification.testing.questions.ObtainText;
import co.com.certification.testing.tasks.loan.EnterInformationLoan;
import co.com.certification.testing.util.OperationsMath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class AddItemApproveConfirmed implements Task {

    public AddItemApproveConfirmed() {
        //Nothing
    }

    public static AddItemApproveConfirmed withTheFollowingField() {
        return instrumented(AddItemApproveConfirmed.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        //create draws
        String contingency = RETAINAGE_CONTINGENCY + 0;
        String interest = RETAINAGE_INTEREST_RESERVE + 0;

        String total_requesting = OperationsMath.sumarNumeros(REQUESTING_CONTINGENCY, REQUESTING_INTEREST_RESERVE);
        String total_retainage = OperationsMath.sumarNumeros(contingency, interest);

        List<String> loanNumbers = EnterInformationLoan.getGeneratedLoanNumbers();

        for (String loanNumber : loanNumbers) {
            actor.attemptsTo(
                    Click.on(By.xpath("//a[normalize-space()='"+ loanNumber + "']")));

            actor.attemptsTo(
                    MoveMouse.to(BTN_SELECT_DRAW),
                    Click.on(BTN_SELECT_DRAW),
                    Click.on(By.xpath("//a[contains(text(), 'Draw Request " + 1 + "')]/ancestor::div[@class='custom-panel-header  panel-heading no-borders noselect']//div[@class='row js-panel-head-tab ']//div//div//div//button[@class='showTooltip additemdraw btn btn-white btn-sm']")),
                    Click.on(BTN_PAYEE_1),
                    SendKeys.of(PAYEE_1).into(INPUT_PAYEE_1),
                    Click.on(INPUT_PAYEE_1),
                    Hit.the(Keys.ENTER).into(INPUT_PAYEE_1),
                    SendKeys.of(REQUESTING_CONTINGENCY).into(INPUT_REQUESTING_CONTINGENCY),
                    SendKeys.of(REQUESTING_INTEREST_RESERVE).into(INPUT_REQUESTING_INTEREST_RESERVE),
                    Click.on(BTN_APPROVE_ITEM_CONTINGENCY),
                    Click.on(BTN_APPROVE_ITEM_INTEREST_RESERVE),
                    Click.on(INPUT_RETAINAGE_CONTINGENCY),
                    SendKeys.of(RETAINAGE_CONTINGENCY).into(INPUT_RETAINAGE_CONTINGENCY),
                    Click.on(INPUT_RETAINAGE_INTEREST_RESERVE),
                    SendKeys.of(RETAINAGE_INTEREST_RESERVE).into(INPUT_RETAINAGE_INTEREST_RESERVE),
                    Click.on(BTN_SAVE_CLOSE)
                );

            actor.should(seeThat(ObtainText.element(LBL_TOTAL_REQUESTING),containsString(total_requesting)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT));

                actor.attemptsTo(
                        WaitUntil.the(BTN_APPROVED_ITEM_CONTINGENCY_ON_2, isEnabled()).forNoMoreThan(2).seconds(),
                        WaitUntil.the(BTN_APPROVED_ITEM_INTEREST_RESERVE_ON, isEnabled()).forNoMoreThan(2).seconds()
                );

                actor.should(
                        seeThat(ObtainText.element(LBL_TOTAL_RETAINAGE_BALANCE),containsString(TOTAL_ZERO)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT),
                        seeThat(ObtainText.element(LBL_TOTAL_APPROVED),containsString(total_requesting)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT),
                        seeThat(ObtainText.element(LBL_TOTAL_RETAINAGE),containsString(total_retainage)).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT),
                        seeThat(ObtainText.element(LBL_TOTAL_APPROVED_LESS_RETAINAGE),containsString(OperationsMath.restarNumeros(total_requesting,total_retainage))).orComplainWith(NotFoundText.class,NotFoundText.THE_VALUE_IS_NOT_EXPECT));


           /* for (int i = 0; i < 2; i++) {
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
                }*/
            actor.attemptsTo(
                    Open.url(InformationUrl.getUatUrlLoanDemoUrl()));
            }
        }
}
