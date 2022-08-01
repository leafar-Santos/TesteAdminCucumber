package cucumber_java.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		plugin ={"pretty","html:target/report.html"},
		glue = "cucumber_java",
		monochrome = false, 
		snippets = SnippetType.CAMELCASE)
public class Runner {

}
