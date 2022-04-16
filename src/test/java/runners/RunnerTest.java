package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/features",
        glue = "steps",
        monochrome = true,
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true
)
public class RunnerTest {
}
