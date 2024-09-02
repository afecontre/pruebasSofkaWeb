package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import static stepdefinitions.CucumberHooks.USER;
import tasks.AddProductToCart;
import tasks.CompleteCheckoutForm;
import tasks.CompletePurchase;
import tasks.OpenHomePage;
import tasks.ViewCart;
import static userinterfaces.DemoblazePage.PLACE_ORDER_BUTTON;
import static userinterfaces.DemoblazePage.PRODUCT_LINK;
import static userinterfaces.DemoblazePage.SECOND_PRODUCT_LINK;


public class CheckoutStepDefinitions {

    @Given("the user is on the Demoblaze home page")
    public void userIsOnDemoblazeHomePage() {
        USER.attemptsTo(OpenHomePage.at("https://www.demoblaze.com"));
    }

    @When("the user adds the first product to the cart")
    public void userAddsFirstProductToCart() {
        USER.attemptsTo(AddProductToCart.forProduct(PRODUCT_LINK));
    }

    @And("the user adds the second product to the cart")
    public void userAddsSecondProductToCart() {
        USER.attemptsTo(AddProductToCart.forProduct(SECOND_PRODUCT_LINK));
    }

    @And("the user views the cart")
    public void userViewsCart() {
        USER.attemptsTo(ViewCart.now());
    }

    @And("the user clicks on Place Order")
    public void userClicksOnPlaceOrder() {
        USER.attemptsTo(Click.on(PLACE_ORDER_BUTTON));
    }

    @And("the user completes the checkout form with details {string}, {string}, {string}, {string}, {string}, {string}")
    public void userCompletesCheckoutForm(String name, String country, String city, String card, String month, String year) {
        USER.attemptsTo(CompleteCheckoutForm.withDetails(name, country, city, card, month, year));
    }

    @Then("the purchase should be completed successfully")
    public void purchaseShouldBeCompletedSuccessfully() {
        USER.attemptsTo(CompletePurchase.now());
    }
}
