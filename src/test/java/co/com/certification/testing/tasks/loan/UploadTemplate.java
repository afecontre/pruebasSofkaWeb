package co.com.certification.testing.tasks.loan;

import co.com.certification.testing.util.RenameDownloadedFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static co.com.certification.testing.pages.loan.LoanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class UploadTemplate implements Task {

    public UploadTemplate() {
        // Nothing
    }

    public static UploadTemplate withCustomerData() {
        return instrumented(UploadTemplate.class);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADVANCED),
                Click.on(BTN_ACTION),
                Click.on(BTN_POST_TRANSACTIONS),
                Open.url("https://lg01.uat-landgorilla.com/clientV2/loan-manager/transactions-import-xlsx?readexcel=")
        );
        // Renombrar el archivo descargado
        RenameDownloadedFile.rename(System.getProperty("user.dir"), "bulk-transactions-template.xlsx");
    }

}
