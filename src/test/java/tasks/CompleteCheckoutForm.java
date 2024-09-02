package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static userinterfaces.DemoblazePage.CITY_FIELD;
import static userinterfaces.DemoblazePage.COUNTRY_FIELD;
import static userinterfaces.DemoblazePage.CREDIT_CARD_FIELD;
import static userinterfaces.DemoblazePage.MONTH_FIELD;
import static userinterfaces.DemoblazePage.NAME_FIELD;
import static userinterfaces.DemoblazePage.PURCHASE_BUTTON;
import static userinterfaces.DemoblazePage.YEAR_FIELD;

public class CompleteCheckoutForm implements Task {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public CompleteCheckoutForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public static CompleteCheckoutForm withDetails(String name, String country, String city, String card, String month, String year) {
        return instrumented(CompleteCheckoutForm.class, name, country, city, card, month, year);
    }

    @Override
    @Step("{0} completes the checkout form with customer data")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(name).into(NAME_FIELD),
            Enter.theValue(country).into(COUNTRY_FIELD),
            Enter.theValue(city).into(CITY_FIELD),
            Enter.theValue(card).into(CREDIT_CARD_FIELD),
            Enter.theValue(month).into(MONTH_FIELD),
            Enter.theValue(year).into(YEAR_FIELD),
            Click.on(PURCHASE_BUTTON)
        );
    }
}
