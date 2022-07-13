package Testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations"
		)
public class LoginTestRunner {

	
	
	
}










//package cucumberOptions;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/test/java/features",
//		//path of feature file till package , glue = package name of stepdefintion file
//		glue = "MyStepDefinitions" 	)
//
//public class TestRunner {
//
//}

