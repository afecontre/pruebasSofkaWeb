package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    publish = true,
    plugin = {"pretty"},
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {}
