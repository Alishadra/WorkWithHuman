package org.itstep.model;

import java.lang.reflect.Constructor;

public class Student extends Human{
	

	public Student(String name, String surname, int age) {
		
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		
	}
	
}
