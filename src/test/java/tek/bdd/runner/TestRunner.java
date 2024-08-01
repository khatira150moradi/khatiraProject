package tek.bdd.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TestRunner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "classpath:features/SecurityTest.feature", // Directory for Feature file
            glue = "tek.bdd.steps", //Package for all the steps
            dryRun = true //set to true to scan feature for unimplemented steps
    )
    public class TestRunner {
    }
}
