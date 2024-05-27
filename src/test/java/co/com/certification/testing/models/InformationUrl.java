package co.com.certification.testing.models;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class InformationUrl {

    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    private InformationUrl() {
        // Prevent instantiation
    }

    public static String getLoginDemoUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("pages.login");
    }

    public static String getUatUrlDemoUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("pages.url_uat");
    }
}
