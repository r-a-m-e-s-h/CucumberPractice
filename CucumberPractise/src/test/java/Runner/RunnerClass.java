package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/OpenGoogle.feature", glue={"StepDefinitions"})

public class RunnerClass {
	

}
