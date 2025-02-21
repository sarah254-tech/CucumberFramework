package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods{
	
	@Then("I want to validate the items on the menu")
	public void i_want_to_validate_the_items_on_the_menu(DataTable dataTable) {
		
		List<String> expectedList = dataTable.asList();
		List<String> actuaList = new ArrayList<>();
		
		// click on the menu item to collapse it
		click(dashboardPage.moreMenuItem);
		wait(3);
		
		// we get the text for each menu item and add it to the actualList
		for (WebElement el : dashboardPage.menuList)
		{
			actuaList.add(el.getText());
		}
		
		System.out.println("Expected list: " + expectedList);
		System.out.println("Actual list: " + actuaList);
		
		// verify that actualList is equal to expectedList
		Assert.assertEquals(expectedList, actuaList);
	    
	}


}
