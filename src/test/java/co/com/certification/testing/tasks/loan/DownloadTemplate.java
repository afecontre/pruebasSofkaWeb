package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.util.RenameDownloadedFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.HashMap;

import static co.com.certification.testing.pages.dashboard.DashboardPage.BTN_LAST_ACTIVITY;
import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DownloadTemplate implements Task {

    public DownloadTemplate() {
        // Nothing
    }

    public static DownloadTemplate withCustomerData() {
        return instrumented(DownloadTemplate.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ACTION),
                Click.on(BTN_POST_TRANSACTIONS),
                Open.url("https://lg01.uat-landgorilla.com//clientV2/files/bulk-transactions-template.xlsx"),
                Open.url("https://lg01.uat-landgorilla.com/clientV2/loan-manager/index")
                //Hit.the(Keys.ESCAPE).into(BTN_POST_TRANSACTIONS)
        );
        // Renombrar el archivo descargado
        RenameDownloadedFile.rename(System.getProperty("user.dir"), "bulk-transactions-template.xlsx");
    }

}
