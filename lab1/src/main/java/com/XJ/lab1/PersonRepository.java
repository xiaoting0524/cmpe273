package com.XJ.lab1;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonRepository {

	List<Person> persons;

	Connection con = null;

	public PersonRepository() {

		persons = new ArrayList<>();

				
		Person p1 = new Person();
		p1.setId(0001);
		p1.setName("Xiaoting Jin");
		p1.setScore(98);

		Person p2 = new Person();
		p2.setId(0002);
		p2.setName("Yuxiang Chen");
		p2.setScore(88);

		Person p3 = new Person();
		p3.setId(0003);
		p3.setName("Tianyu Cao");
		p3.setScore(100);
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);


	}

	public List<Person> getPersons() {

		return persons;

	}

	public Person getPerson(int id) {

		for(Person p: persons) {
			if(p.getId() == id) {
				return p;
			}
		}
		return new Person();
	}

	public void create(Person p) {

		persons.add(p);
	}
}
