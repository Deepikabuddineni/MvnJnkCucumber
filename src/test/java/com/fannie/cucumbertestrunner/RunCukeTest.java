package com.fannie.cucumbertestrunner;


	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/com/fanniemae/features",
			glue = "com.fannie.step_definitions"
)

			
	public class RunCukeTest {
		
	
	}
	


