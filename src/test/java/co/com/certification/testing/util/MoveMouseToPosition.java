package co.com.certification.testing.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class MoveMouseToPosition implements Task {

    private final int x;
    private final int y;
    private final Target target;

    public MoveMouseToPosition(int x, int y, Target target) {
        this.x = x;
        this.y = y;
        this.target = target;
    }

    @Step("{0} moves the mouse to the position (#x, #y) and clicks on #target")
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor);
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.moveToElement(element, x, y).click().perform();
    }

    public static MoveMouseToPosition to(int x, int y, Target target) {
        return new MoveMouseToPosition(x, y, target);
    }
}
