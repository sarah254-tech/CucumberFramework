package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Lirika", 22);
		
		List<Person> listOfPeople = new ArrayList<>();	
		
		listOfPeople.add(p1);
		listOfPeople.add(new Person("Everest", 27));
		listOfPeople.add(new Person("Ahmet", 54));
		
		System.out.println(listOfPeople);

	}

}

class Person {
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " " + age;
	}
}
