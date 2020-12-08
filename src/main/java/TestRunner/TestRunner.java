package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"StepDefinition"})
public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Running E2E");
    }
}