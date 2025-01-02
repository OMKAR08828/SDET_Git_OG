package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Feature/Login.feature"},
glue= {"StepDefinitionss"},
plugin= {"pretty", "html:target/htmlreports.html"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	
	
}