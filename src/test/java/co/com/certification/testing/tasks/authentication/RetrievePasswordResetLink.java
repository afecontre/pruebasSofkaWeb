
package co.com.certification.testing.tasks.authentication;

import java.io.IOException;
import java.security.GeneralSecurityException;
import co.com.certification.testing.util.GmailApiUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RetrievePasswordResetLink implements Task {
    private final String email;

    public RetrievePasswordResetLink(String email) {
        this.email = email;
    }

    public static RetrievePasswordResetLink forEmail(String email) {
        return instrumented(RetrievePasswordResetLink.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String resetLink;
        try {
            resetLink = GmailApiUtil.getLatestResetPasswordLink(email);
            actor.remember("resetLink", resetLink);
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to retrieve the reset link", e);
        }
    }
}