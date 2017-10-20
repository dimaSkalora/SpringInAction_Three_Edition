package part_2.head_06.journaldev_spring_jdbc_example.com.journaldev.spring.jdbc.dao;

import part_2.head_06.journaldev_spring_jdbc_example.com.journaldev.spring.jdbc.model.Employee;

import java.util.List;


//CRUD operations
public interface EmployeeDAO {
	
	//Create
	public void save(Employee employee);
	//Read
	public Employee getById(int id);
	//Update
	public void update(Employee employee);
	//Delete
	public void deleteById(int id);
	//Get All
	public List<Employee> getAll();
}
