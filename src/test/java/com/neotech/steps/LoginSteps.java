package com.neotech.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("I navigated to HRM website")
	public void i_navigated_to_hrm_website() {
		setUp();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(loginPage.loginBtn);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboardPage.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed!!!");
		} else {
			System.out.println("Test Failed!!!");
		}
	}

	@Then("I quit the browser")
	public void i_quit_the_browser() {
		tearDown();
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(loginPage.password, "Wrong Password");
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {

		String expected = "Invalid Credentials";
		String actual = loginPage.invalidMsg.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_and(String username, String password) {
		sendText(loginPage.username, username);
		sendText(loginPage.password, password);
	}

	@Then("verify that {string} is displayed")
	public void verify_that_is_displayed(String employeeName) {
		String actualName = dashboardPage.accountName.getText();
		
		Assert.assertEquals("The account name does not match",employeeName, actualName);
	}
	
	@When("user enters username and passowrd and clicks on the login button")
	public void user_enters_username_and_passowrd_and_clicks_on_the_login_button(DataTable employees) {
	    
		// TODO
		// for every row in the employees dataTable --> user
		// send login credentials
		// click on the login button
		// verify the employee name
		// logout
		
		// convert the dataTable into Map objects 
		List<Map<String, String>> employeeList = employees.asMaps();
		
		// now iterate over the employeeList and do the login, verification, and logout
		for (Map<String, String> employee : employeeList)
		{
			System.out.println("Logging in with: " + employee.get("username") + 
						" and password: " + employee.get("password"));
			
			//login
			sendText(loginPage.username, employee.get("username"));
			sendText(loginPage.password, employee.get("password"));
			
			// login button
			click(loginPage.loginBtn);
			
			// verify 
			String actualName = dashboardPage.accountName.getText();
			Assert.assertEquals("The account name does not match!", employee.get("employeeName"), actualName);
			
			// logout
			click(dashboardPage.accountMenu);
			click(dashboardPage.logout);
		}
		
	}


}
