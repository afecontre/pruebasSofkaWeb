package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class NavigateToResetPassword {

    private NavigateToResetPassword(){
        //Nothing
    }
    public static Performable web(){
        return Task.where("",
                WaitUntil.the(LBL_RESET_PASSWORD, isEnabled()).forNoMoreThan(5).seconds(),
                Scroll.to(By.id("blockResetPassword")));
    }
}
