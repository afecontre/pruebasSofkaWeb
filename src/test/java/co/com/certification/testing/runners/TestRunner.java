package co.com.certification.testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish=true,
plugin={"pretty"},
features = "src/test/resources/features",
glue="co.com.certification.testing",
tags="@SYU-001",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner {
}