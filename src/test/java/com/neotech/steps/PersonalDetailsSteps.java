package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	//	selectDropdown(personalDetailsPage.genderDD, gender);
		
		//2nd way: click and select (click)
	//	click(personalDetailsPage.genderInput);
		//click on the element based on the gender string
	//	click(driver.findElement(By.xpath("//span[text()='"+gender+ "']")));
		
		
		//3rd way: click, get all options and loop to find the one to click on
		selectDropdownByClicking(personalDetailsPage.genderInput, personalDetailsPage.genderOptions, gender);
		
		
		//select nationality
		selectDropdownByClicking(personalDetailsPage.nationalityInput, personalDetailsPage.nationalityOptions, nationality);
		
		
		
		//set the expiration date
		
		//this is our incoming format: 2026-02-08
		String[] dateParts = expirationDate.split("-");
		//dateParts = ["2026", "02", "08"]
		
		//lets click on the date icon
		click(personalDetailsPage.licExpDate);
		
		//select year -- call selectDropdownByClicking( input ,   options,  value)
		selectDropdownByClicking(personalDetailsPage.licExpYearInput, personalDetailsPage.licExpYearOptions, dateParts[0]);

		//select month -- 
		 //month is datePart[1] -- "02" ----> int 2
		int month = Integer.parseInt(dateParts[1]);
		click(personalDetailsPage.licExpMonthInput);
		click(personalDetailsPage.licExpMonthOptions.get(month-1));
		
		
		
		int day = Integer.parseInt(dateParts[2]);
		selectCalendarDate(personalDetailsPage.licExpDays, day+"");
		
		wait(2);
	}
	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {

		click(personalDetailsPage.detailsSaveBtn);
	}
	
	/**
	 * This method will click on the input tag of a dropdown and then get all the options, then 
	 * would compare and click on the given option value.
	 * 
	 * @param input
	 * @param options
	 * @param value
	 */
	public void selectDropdownByClicking(WebElement input, List<WebElement> options, String value)
	{
		click(input);
		
		wait(1);
		
		for (WebElement option : options)
		{
			if (option.getText().equals(value))
			{
				click(option);
				break;
			}
		}	
	}
	
	
	
}
