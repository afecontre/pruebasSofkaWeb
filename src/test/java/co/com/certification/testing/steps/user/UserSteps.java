package co.com.certification.testing.steps.user;

import co.com.certification.testing.tasks.authentication.LoginButton;
import co.com.certification.testing.tasks.authentication.ResetLink;
import co.com.certification.testing.tasks.user.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static co.com.certification.testing.steps.conf.Hooks.USER;

public class UserSteps {
    @When("valid home system user")
    public void validHomeSystemUser() {
        USER.attemptsTo(UserHome.withTheFollowingField());
    }

    @And("the user clicks New User option")
    public void theUserClicksNewUserOption() {
        USER.attemptsTo(NewUserButton.withTheFollowingField());
    }

    @And("enters the User information {string}")
    public void entersTheUserInformation(String email) {
        USER.attemptsTo(EnterInformationUser.withCustomerData(email));
    }

    @And("validated the information entered")
    public void validatedTheInformationEntered() {
        USER.attemptsTo(ValidateInformationUser.withTheFollowingField());
    }

    @And("delete user created")
    public void deleteUserCreated() {
        USER.attemptsTo(DeleteUser.withTheFollowingField());
    }

    @And("the user should receive a Account")
    public void theUserShouldReceiveAAccount() {
        USER.attemptsTo(ResetLinkAccount.withTheFollowingField());

    }
    @And("the user enter new account {string}")
    public void theUserEnterNewAccount(String email) {
        USER.attemptsTo(
                EnterNewAccount.withCustomerData(email));
                //LoginButton.withTheFollowingField());
    }
}
