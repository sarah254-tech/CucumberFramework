package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExampleSteps {

	
	@Given("Precondition1")
	public void precondition1() {
		System.out.println("Precondition1");
	}
	@Given("Precondition2")
	public void precondition2() {
		System.out.println("Precondition2");
	}
	@When("Test Step1")
	public void test_step1() {
		System.out.println("Test Step1");
	}
	
	
	@When("Test Step2")
	public void test_step2() {
		System.out.println("Test Step2");
	}
	@Then("Validation Step1")
	public void validation_step1() {
		System.out.println("Validation Step1");
	}
	@Then("Validation Step2")
	public void validation_step2() {
		System.out.println("Validation Step2");
	}

	@When("Test Step3")
	public void test_step3() {
		System.out.println("Test Step3");
	}
	@When("Test Step4")
	public void test_step4() {
		System.out.println("Test Step4");
	}
	@Then("Validation Step3")
	public void validation_step3() {
		System.out.println("Validation Step3");
	}
	@Then("Validation Step4")
	public void validation_step4() {
		System.out.println("Validation Step4");
	}

	
	@When("Test Step1 firstName is {string} and lastName is {string}")
	public void test_step1_first_name_is_and_last_name_is(String firstName, String lastName) {
	   System.out.println("Running Test Step1 for " + firstName 
			   				+ " " + lastName);
	}
	
	
}
