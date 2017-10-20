package part_2.head_06.journaldev_spring_hibernate_integration.com.journaldev.dao;

import part_2.head_06.journaldev_spring_hibernate_integration.com.journaldev.model.Person;

import java.util.List;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
