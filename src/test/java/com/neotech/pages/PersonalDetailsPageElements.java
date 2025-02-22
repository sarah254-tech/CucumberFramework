package com.neotech.pages;

import java.util.List;

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
	
	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerCheckBox;
	
	@FindBy(id = "emp_gender")
	public WebElement genderDD;  //tried selectDropdown with the Select tag
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/input")
	public WebElement genderInput; //used to click on the gender dropdown
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']//li")
	public List<WebElement> genderOptions;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//input")
	public WebElement nationalityInput; //used to click on the nationality dropdown
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//li")
	public List<WebElement> nationalityOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//i")
	public WebElement licExpDate;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licExpYearInput;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--year']//li")
	public List<WebElement> licExpYearOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licExpMonthInput;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--month']//li")
	public List<WebElement> licExpMonthOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//td")
	public List<WebElement> licExpDays;
	
	@FindBy(xpath = "//form[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement detailsSaveBtn;
	
	

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
