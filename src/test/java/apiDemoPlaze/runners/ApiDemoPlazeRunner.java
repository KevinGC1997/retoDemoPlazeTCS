package apiDemoPlaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/apiDemoPlaze/ApiDemoPlaze.feature",
        glue = "apiDemoPlaze.stepDefinitions",
        tags = "@PostSingUp or @PostLogin",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ApiDemoPlazeRunner {
}
