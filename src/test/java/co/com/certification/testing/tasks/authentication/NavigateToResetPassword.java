package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.Pause;
import co.com.certification.testing.util.ScrollById;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.swing.*;
import java.util.Scanner;

import static co.com.certification.testing.pages.authentication.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static co.com.certification.testing.steps.conf.Hooks.USER;


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
