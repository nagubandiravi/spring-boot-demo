package com.test.sb.springbootdemo.person;

import java.util.List;

public interface PersonService {

	public List<Person> findAll();
	
	public Person findById(String id);
	
	public Person findByName(String name);
}
