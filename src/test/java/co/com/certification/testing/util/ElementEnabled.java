package co.com.certification.testing.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ElementEnabled implements Question<Boolean> {

    private final Target target;

    public ElementEnabled(Target target) {
        this.target = target;
    }

    public static ElementEnabled forTarget(Target target) {
        return new ElementEnabled(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            WebElement element = target.resolveFor(actor);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}