package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	
	@When("I login to HRMs")
	public void i_login_to_hr_ms() {
	    System.out.println("Login");
	}
	@When("I want to add Employees")
	public void i_want_to_add_employees(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		//List of Maps -- How would it look like?
		/*
		Map<String, String> map1 = new HashedMap<>();
		map1.put("FirstName", "Ahmet");
		map1.put("MiddleName", "Kenan");
		map1.put("LastName", "Manioglu");
		
		Map<String, String> map2 = new HashedMap<>();
		map2.put("FirstName", "May");
		map2.put("MiddleName", "");
		map2.put("LastName", "M.");
		
		Map<String, String> map3 = new HashedMap<>();
		map3.put("FirstName", "Mehmed");
		map3.put("MiddleName", "Sezgin");
		map3.put("LastName", "Mehmed");
		
		List<Map<String, String>> lm = new ArrayList<>();	
		lm.add(map1);
		lm.add(map2);
		lm.add(map3);
		*/
		
		// getting the data from the incoming dataTable --> List<Map<String,String>>
		List<Map<String,String>> listOfMaps = dataTable.asMaps();
		
		for (Map<String, String> map: listOfMaps)
		{
			System.out.println(map);
			System.out.println("---------------------");
			System.out.println("First Name: " + map.get("FirstName"));
			System.out.println("Middle Name: " + map.get("MiddleName"));
			System.out.println("Last Name: " + map.get("LastName"));
		}
	}
	@Then("I validate employee is added")
	public void i_validate_employee_is_added() {
		System.out.println("Validated Employee Added!");
	}




}
