package tasks;

import org.junit.Assert;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterfaces.DemoblazePage.CART_BUTTON;
import static userinterfaces.DemoblazePage.CART_NOKIA_LUMIA_1520;
import static userinterfaces.DemoblazePage.CART_SAMSUNG_GALAXY_S6;
import static userinterfaces.DemoblazePage.PLACE_ORDER_BUTTON;  // Importa Duration para Selenium 4



public class ViewCart implements Task {

    public static ViewCart now() {
        return instrumented(ViewCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CART_BUTTON)
        );

        // Validar que ambos productos están en el carrito
        String samsungGalaxyS6 = Text.of(CART_SAMSUNG_GALAXY_S6).answeredBy(actor);
        String nokiaLumia1520 = Text.of(CART_NOKIA_LUMIA_1520).answeredBy(actor);

        Assert.assertTrue("El producto 'Samsung galaxy s6' no se encontró en el carrito.", samsungGalaxyS6.contains("Samsung galaxy s6"));
        Assert.assertTrue("El producto 'Nokia lumia 1520' no se encontró en el carrito.", nokiaLumia1520.contains("Nokia lumia 1520"));
   actor.attemptsTo(
            WaitUntil.the(PLACE_ORDER_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(PLACE_ORDER_BUTTON)
        );
        
    }
}
