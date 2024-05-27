package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.models.InformationUrl;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.testing.pages.authentication.LoginPage.LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class NavigateTo {

    private NavigateTo(){
        //Nothing
    }

    public static Performable web(){
        return Task.where("Login UAT",
                Open.url(InformationUrl.getLoginDemoUrl()),
                WaitUntil.the(LOGIN, isEnabled()).forNoMoreThan(5).seconds());
    }
}
