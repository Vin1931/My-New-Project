package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\First_Cucumber\\src\\test\\java\\Feature\\Login.feature",
		glue="StepDefination",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:Report/newreport.html",
				"json:Report/newreport.json",
				"rerun:target/rerun.txt",
		}
		)

public class Test {

}
