package com.neotech.steps;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class PersonalDetailsSteps extends CommonMethods {

	
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String driverLicense, String expirationDate, String smoker, String gender, String nationality) {

		//wait for the whole form to show up
		waitForVisibility(personalDetailsPage.personalDetailsForm);
		
		//send license number
		sendText(personalDetailsPage.drivingLicense, driverLicense);
		
		//click on smoker checkbox if the smoker value is Yes
		if (smoker.equals("Yes"))
		{
			click(personalDetailsPage.smokerCheckBox);
		}
		
		
		//select gender
		
		//1st way: select Dropdown
		selectDropdown(personalDetailsPage.genderDD, gender);
		
		//2nd way: click and select (click)
		click(personalDetailsPage.genderInput);
		click(driver.findElement(By.xpath("//span[text()='"+gender+ "']")));
		
		
		
	}
	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
