package co.com.certification.testing.pages.authentication;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPage {
    public static final Target LOGIN= Target.the( "Login Page")
            .located(By.xpath("//*[@id=\"asso\"]"));
    public static final Target INPUT_USERNAME= Target.the("Username")
            .located(By.xpath("//*[@id=\"txtLogin\"]"));
    public static final Target INPUT_PASSWORD= Target.the("Password")
            .located(By.xpath("//*[@id=\"txtPassword\"]"));
    public static final Target BTN_LOGIN= Target.the("Button Login")
            .located(By.xpath("//*[@id=\"btnLogin\"]"));
    public static final Target HOME= Target.the("Start")
            .located(By.xpath("//div[@class='col-lg-3']//div[@class='ibox ibox-primary']//div[@class='ibox-title']/h5[text()='Orders']"));
    public static final Target USER_PASS_INVALIDO= Target.the("Username and Password invalid")
            .located(By.xpath("//*[@id=\"loginAlert\"]/div/span"));
    public static final Target EMAIL_EMPTY= Target.the("Email Empty")
            .located(By.xpath("//*[contains(text(),'The Email field is required.')]"));
    public static final Target PASSWORD_EMPTY= Target.the("Password Empty")
            .located(By.xpath("//*[contains(text(),'The Password field is required.')]"));
    public static final Target FORGOT_PASS= Target.the("Forgot Password")
            .located(By.xpath("//*[@id=\"afpass\"]"));
    public static final Target EMAIL_RECOVERY= Target.the("Email Recovery")
            .located(By.xpath("//*[@id=\"email_address\"]"));
    public static final Target BTN_IDENTIFY= Target.the("Button Login")
            .located(By.xpath("//*[@id=\"forgotPasswBlockClient\"]/div[2]/div/div[2]/button"));
    public static final Target MESSAGE_RECOVERY= Target.the("Message Recovery")
            .located(By.xpath("//*[contains(text(),'A message was sent to your e-mail address with instructions to reset your password')]"));
    public static final Target EMAIL_INVALID= Target.the("Email Address Invalid")
            .located(By.xpath("//span[contains(text(),'Please enter a valid email address.')]"));
    public static final Target EMAIL_ANS_PASSWORD_INVALID= Target.the("Email Address Invalid")
            .located(By.xpath("//span[contains(text(),'The username or password is invalid.')]"));
    public static final Target LBL_RESET_PASSWORD= Target.the("Reset Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]"));
    public static final Target INPUT_NEW_PASSWORD= Target.the("New Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]/div[3]/input"));
    public static final Target INPUT_NEW_PASSWORD_AGAIN= Target.the("New Password")
            .located(By.xpath("//*[@id=\"blockResetPassword\"]/div[4]/input"));
    public static final Target MESSAGE_EXPIRED= Target.the("Message Expired")
            .located(By.xpath("//span[@class=\"link-reset-password\"]"));
    public static final Target BTN_EXPIRED= Target.the("Button Expired")
            .located(By.xpath("//a[contains(text(),'click here')]"));
    public static final Target BTN_SETPASSWORD= Target.the("Button Set The Password")
            .located(By.xpath("//button[contains(text(),'Set The Password')]"));
    public static final Target MESSAGE_UPDATE= Target.the("Message Update")
            .located(By.xpath("//*[contains(text(),'Your password was successfully updated.')]"));
    public static final Target BTN_SESSION= Target.the("Session")
            .located(By.xpath("//a[@class='user-header']"));
    public static final Target BTN_LOGOUT= Target.the("Logout")
            .located(By.xpath("//li/a[text()='Log Out']\n"));



}