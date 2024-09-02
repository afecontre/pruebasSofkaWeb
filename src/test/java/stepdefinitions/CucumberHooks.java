package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class CucumberHooks {
    public static final Actor USER = Actor.named("Usuario");

    @Managed(uniqueSession = true)
    private WebDriver driver;
    
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        USER.can(BrowseTheWeb.with(driver));
    }
}
