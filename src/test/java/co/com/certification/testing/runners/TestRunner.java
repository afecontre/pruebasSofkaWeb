package co.com.certification.testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish=true,
plugin={"pretty"},
features = "src/test/resources/features",
glue="co.com.certification.testing",
tags="@lg_dashboard or @lg_activity or @lg_reset or @lg_forgot or @lg_login",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner {
}

