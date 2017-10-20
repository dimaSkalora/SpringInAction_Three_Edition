package part_2.head_06.journaldev_spring_hibernate_integration.com.journaldev.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_06.journaldev_spring_hibernate_integration.com.journaldev.dao.PersonDAO;
import part_2.head_06.journaldev_spring_hibernate_integration.com.journaldev.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Part_2-resources/Head_06/journaldev_spring-hibernate-integration/spring4.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Pankaj"); person.setCountry("India");
		
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		
		context.close();
		
	}

}
