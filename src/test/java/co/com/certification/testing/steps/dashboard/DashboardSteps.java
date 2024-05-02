package co.com.certification.testing.steps.dashboard;

import co.com.certification.testing.tasks.authentication.*;
import co.com.certification.testing.tasks.authentication.SelectLoanType;
import co.com.certification.testing.tasks.dashboard.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

import static co.com.certification.testing.steps.conf.Hooks.USER;

@Test
public class DashboardSteps {
    @Then("valid for complete sections")
    public void validForCompleteSections() {
        USER.attemptsTo(DashboardHome.withTheFollowingFields());
        }

    @Then("it is valid to show the number of active orders")
    public void itIsValidToShowTheNumberOfActiveOrders() {
        USER.attemptsTo(ItemActivate.withTheFollowingFields());
    }

    @And("click en el filtro por {string}")
    public void clickEnElFiltroPor(String period) {
        USER.attemptsTo(FilterForDay.withTheFollowingField(period));
    }
    @Then("validar los graficos")
    public void validarLosGraficos() {
        USER.attemptsTo(GraphicValidate.withTheFollowingField());
    }


    @And("click filtro Orders")
    public void clickFiltroOrders() {
        USER.attemptsTo(FilterOrders.withTheFollowingField());
    }

    @And("filtrar por {string}")
    public void filtrarPor(String filter) {
        USER.attemptsTo(FilterBy.withTheFollowingField(filter));
    }

    @And("seleccionar el tipo {string}")
    public void seleccionarElTipo(String type_loan) {
        USER.attemptsTo(SelectLoanType.withTheFollowingField(type_loan));
    }

    @And("click filtro Loan")
    public void clickFiltroLoan() {
        USER.attemptsTo(SelectLoanFilter.withTheFollowingField());
    }

    @And("click filtro Draws")
    public void clickFiltroDraws() {
        USER.attemptsTo(SelectDrawFilter.withTheFollowingField());
    }

    @And("click filtro Change Orders")
    public void clickFiltroChangeOrders() {
        USER.attemptsTo(SelectChangeOrdersFilter.withTheFollowingField());
    }

    @And("seleccionar el view {string}")
    public void seleccionarElView(String view) {
        USER.attemptsTo(SelectView.withTheFollowingField(view));
    }

    @And("click filtro Loan Activity")
    public void clickFiltroLoanActivity() {
        USER.attemptsTo(FilterLoanActivity.withTheFollowingField());
    }

    @Then("valida la informacion organizada")
    public void validaLaInformacionOrganizada() {
        USER.attemptsTo(InformationValidate.withTheFollowingField());
    }

    @And("seleccionar el time {string}")
    public void seleccionarElTime(String time) {
        USER.attemptsTo(SelectLastActivity.withTheFollowingField(time));
    }
}
