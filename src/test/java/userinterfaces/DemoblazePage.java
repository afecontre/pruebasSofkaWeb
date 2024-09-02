package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DemoblazePage {
    public static final Target PRODUCT_LINK = Target.the("First product link")
        .located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));

    public static final Target SECOND_PRODUCT_LINK = Target.the("Second product link")
        .located(By.xpath("//a[contains(text(),'Nokia lumia 1520')]"));

    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
        .locatedBy("//a[contains(text(),'Add to cart')]");

    public static final Target HOME_BUTTON = Target.the("Home button")
        .locatedBy("//a[contains(@class, 'nav-link') and contains(text(), 'Home')]");

    public static final Target CART_BUTTON = Target.the("Cart button")
        .locatedBy("//a[@id='cartur']");

    public static final Target CART_SAMSUNG_GALAXY_S6 = Target.the("Samsung galaxy s6 in cart")
        .located(By.xpath("//td[contains(text(),'Samsung galaxy s6')]"));

    public static final Target CART_NOKIA_LUMIA_1520 = Target.the("Nokia lumia 1520 in cart")
        .located(By.xpath("//td[contains(text(),'Nokia lumia 1520')]"));

    public static final Target NAME_FIELD = Target.the("Name field")
        .locatedBy("//input[@id='name']");

    public static final Target COUNTRY_FIELD = Target.the("Country field")
        .locatedBy("//input[@id='country']");

    public static final Target CITY_FIELD = Target.the("City field")
        .locatedBy("//input[@id='city']");

    public static final Target CREDIT_CARD_FIELD = Target.the("Credit card field")
        .locatedBy("//input[@id='card']");

    public static final Target MONTH_FIELD = Target.the("Month field")
        .locatedBy("//input[@id='month']");

    public static final Target YEAR_FIELD = Target.the("Year field")
        .locatedBy("//input[@id='year']");

    public static final Target PURCHASE_BUTTON = Target.the("Purchase button")
        .locatedBy("//div[@id='orderModal']//button[contains(@class, 'btn-primary')]");

    public static final Target CONFIRM_PURCHASE_BUTTON = Target.the("Confirm purchase button")
        .locatedBy("//button[contains(@class, 'confirm')]");

    public static final Target PLACE_ORDER_BUTTON = Target.the("Place Order button")
        .locatedBy("//button[contains(text(),'Place Order')]");
}
