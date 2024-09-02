package tasks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;  // Importa Duration para Selenium 4
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static userinterfaces.DemoblazePage.ADD_TO_CART_BUTTON;
import static userinterfaces.DemoblazePage.HOME_BUTTON;

public class AddProductToCart implements Task {

    private final Target productLink;

    public AddProductToCart(Target productLink) {
        this.productLink = productLink;
    }

    public static AddProductToCart forProduct(Target productLink) {
        return instrumented(AddProductToCart.class, productLink);
    }

    @Override
    @Step("{0} selects a product and adds it to the cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(productLink, isVisible()).forNoMoreThan(30).seconds(),
            Click.on(productLink),
            WaitUntil.the(ADD_TO_CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(ADD_TO_CART_BUTTON)
        );

        // Manejar la alerta de confirmación usando Duration para Selenium 4
        WebDriver driver = as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  // Cambiado a Duration.ofSeconds(30)
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        // Regresar a la página principal después de añadir el producto al carrito
        actor.attemptsTo(
            WaitUntil.the(HOME_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(HOME_BUTTON)
        );
    }
}
