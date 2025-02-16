package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Irena");
		list.add("Everest");
		list.add("Ahmet");
		
		System.out.println(list);
		
		for (String name: list)
		{
			System.out.println(name);
		}

	}

}
