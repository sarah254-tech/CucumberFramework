package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//we can specify which features to run
		features="src/test/resources/features/",

		//we can specify where the codes for the features are
		glue="com.neotech.steps", 
		
		//if this is set to true --> it only checks if the steps are glued (no functionality execution)
		
		dryRun=false, 
		
		// by default is false. When true will makes the console (and logs) more readable.
		monochrome=true, 
		
		//we can define a tag or a combination of tags to run
		tags= "@smoke and @regression"
		
		
		)



public class TestRunner {

}
