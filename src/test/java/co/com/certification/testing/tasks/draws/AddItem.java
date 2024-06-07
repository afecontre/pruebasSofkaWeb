package co.com.certification.testing.tasks.draws;

import co.com.certification.testing.models.InformationUrl;
import co.com.certification.testing.tasks.loan.EnterInformationLoan;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.testing.pages.loan.LoanPage.*;
import static co.com.certification.testing.pages.loan.LoanPage.BTN_DEPOSIT_ITEM_CONTINGENCY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItem implements Task {

    public AddItem() {
        //Nothing
    }

    public static AddItem withTheFollowingField() {
        return instrumented(AddItem.class);
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
                    MoveMouse.to(BTN_SELECT_DRAW),
                    Click.on(BTN_SELECT_DRAW),
                    Click.on(By.xpath("//a[contains(text(), 'Draw Request " + 1 + "')]/ancestor::div[@class='custom-panel-header  panel-heading no-borders noselect']//div[@class='row js-panel-head-tab ']//div//div//div//button[@class='showTooltip additemdraw btn btn-white btn-sm']")),
                    Click.on(BTN_PAYEE_1),
                    SendKeys.of("Roberto Carlos Mechan").into(INPUT_PAYEE_1),
                    Click.on(INPUT_PAYEE_1),
                    Hit.the(Keys.ENTER).into(INPUT_PAYEE_1),
                    SendKeys.of("1000").into(INPUT_REQUESTING_CONTINGENCY),
                    SendKeys.of("1000").into(INPUT_REQUESTING_INTEREST_RESERVE),
                    Click.on(INPUT_RETAINAGE_CONTINGENCY),
                    Enter.theValue("").into(INPUT_RETAINAGE_CONTINGENCY),
                    Click.on(INPUT_RETAINAGE_CONTINGENCY),
                    SendKeys.of("200").into(INPUT_RETAINAGE_CONTINGENCY),
                    Click.on(INPUT_RETAINAGE_INTEREST_RESERVE),
                    Enter.theValue("").into(INPUT_RETAINAGE_INTEREST_RESERVE),
                    Click.on(INPUT_RETAINAGE_INTEREST_RESERVE),
                    SendKeys.of("200").into(INPUT_RETAINAGE_INTEREST_RESERVE),
                    Click.on(BTN_DEPOSIT_ITEM_CONTINGENCY),
                    Click.on(BTN_DEPOSIT_ITEM_INTEREST_RESERVE),
                    Click.on(BTN_APPROVE_ITEM_CONTINGENCY),
                    Click.on(BTN_APPROVE_ITEM_INTEREST_RESERVE),

                    Click.on(BTN_SAVE_CLOSE)


                );

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
