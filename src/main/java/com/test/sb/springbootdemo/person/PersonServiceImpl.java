package com.test.sb.springbootdemo.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {
	
	public static List<Person> persons = new ArrayList<>();
	
	static {
		persons.add(new Person("1", "Ravi", "Hyderbad"));
		persons.add(new Person("2", "Ram", "Hyderbad"));
		persons.add(new Person("3", "John", "Hyderbad"));
	}

	@Override
	public List<Person> findAll() {
		return persons;
	}

	@Override
	public Person findById(String id) {
		for (Person person:persons) {
			if (id.equals(person.getId())) {
				return person;
			}
		}
		return null;
	}
	
	@Override
	public Person findByName(String name) {
		for (Person person:persons) {
			if (name.equals(person.getName())) {
				return person;
			}
		}
		return null;
	}

}
