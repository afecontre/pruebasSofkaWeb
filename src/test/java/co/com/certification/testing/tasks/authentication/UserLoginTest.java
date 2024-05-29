package co.com.certification.testing.tasks.authentication;

import co.com.certification.testing.util.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_PASSWORD;
import static co.com.certification.testing.pages.authentication.LoginPage.INPUT_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class UserLoginTest implements Task {


    private final String user;

    public UserLoginTest(String user) {
        this.user = user;
    }

    public static UserLoginTest withCustomerData(String user) {
        return instrumented(UserLoginTest.class,user);
    }

    @Override
    @Step("{0} enters-select search information")
    public <T extends Actor> void performAs(T actor) {
        try {
            // Construct the relative path to the users.json file
            Path path = Paths.get("src", "test", "resources", "json", "users.json");

            // Read the file content as a byte array
            byte[] jsonData = Files.readAllBytes(path);

            // Deserialize the JSON content into the Users class
            ObjectMapper objectMapper = new ObjectMapper();
            Users users = objectMapper.readValue(jsonData, Users.class);

            // Get user credentials
            Users.User userData = users.users.get(user);

            actor.attemptsTo(
                    WaitUntil.the(INPUT_USERNAME, isEnabled()).forNoMoreThan(8).seconds(),
                    SendKeys.of(userData.username).into(INPUT_USERNAME),
                    SendKeys.of(userData.password).into(INPUT_PASSWORD)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
