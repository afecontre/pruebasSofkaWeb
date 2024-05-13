package co.com.certification.testing.steps.conf;

import io.cucumber.java.Before;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Hooks {
    public static final Actor USER = Actor.named("Usuario");

    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        sharedComponents.setDriver(driver);

        OnStage.setTheStage(new OnlineCast());
        USER.whoCan(BrowseTheWeb.with(driver));
    }
}
