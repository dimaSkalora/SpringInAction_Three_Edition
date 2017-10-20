package part_2.head_06.journaldev_spring_jdbc_example.com.journaldev.spring.jdbc.model;

public class Employee {

	private int id;
	private String name;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString(){
		return "{ID="+id+",Name="+name+",Role="+role+"}";
	}
}
