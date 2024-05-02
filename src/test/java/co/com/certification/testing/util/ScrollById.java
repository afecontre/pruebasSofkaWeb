package co.com.certification.testing.util;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.markers.IsHidden;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollById implements Task, IsHidden {
    private final String resourceId;

    public ScrollById(String resourceId) {
        this.resourceId = resourceId;
    }

    public static ScrollById toFindTheParameters(String resourceId) {
        return instrumented(ScrollById.class, resourceId);
    }

    @Override
    @Step("Searching for the #resourceId parameter in the list")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.findElement(By.xpath(resourceId));
    }
}
