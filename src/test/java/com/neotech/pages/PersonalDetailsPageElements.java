package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement fullName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;
	
	@FindBy(id = "licenseNo")
	public WebElement drivingLicense;
	
	@FindBy(id = "smoker")
	public WebElement smokerCheckBox;
	
	@FindBy(id = "emp_gender")
	public WebElement genderDD;  //tried selectDropdown with the Select tag
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/input")
	public WebElement genderInput; //used to click on the gender dropdown
	
	

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
