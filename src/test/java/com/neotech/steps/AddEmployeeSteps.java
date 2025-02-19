package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {

	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
		click(dashboardPage.PIM);
		click(dashboardPage.addEmployeeLink);
	}

	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
		sendText(addEmployeePage.firstName, "Lionel");
		sendText(addEmployeePage.lastName, "Messi");
	}

	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropdown(addEmployeePage.location, "New York Sales Office");
		wait(1);
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		click(addEmployeePage.saveButton);
	}

	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
		waitForVisibility(personalDetailsPage.fullName);

		String expected = "Lionel Messi";
		String actual = personalDetailsPage.fullName.getText();

		// Please make sure you import Assert class under org.junit package
		Assert.assertEquals("The employee name does NOT match!", expected, actual);
	}

}
