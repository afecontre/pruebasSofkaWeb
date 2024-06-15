
package co.com.certification.testing.tasks.user;

import co.com.certification.testing.util.GmailApiUtilAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RetrieveAccountResetLink implements Task {
    private final String email;

    public RetrieveAccountResetLink(String email) {
        this.email = email;
    }

    public static RetrieveAccountResetLink forEmail(String email) {
        return instrumented(RetrieveAccountResetLink.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] resetLink;
        try {
            resetLink = GmailApiUtilAccount.getLatestResetPasswordLink(email);
            actor.remember("resetLink", resetLink[0]);
            actor.remember("password_new", resetLink[1]);

        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to retrieve the reset link", e);
        }
    }
}