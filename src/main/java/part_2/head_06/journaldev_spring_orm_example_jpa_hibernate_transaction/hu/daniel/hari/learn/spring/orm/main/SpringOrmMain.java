package part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.model.Product;
import part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.service.ProductService;

public class SpringOrmMain {
	
	public static void main(String[] args) {
		
		//Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"Part_2-resources/Head_06/journaldev-spring-orm-example-jpa-hibernate-transaction/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		ProductService productService = ctx.getBean(ProductService.class);
		
		//Do some data operation
		
		productService.add(new Product(1, "Bulb"));
		productService.add(new Product(2, "Dijone mustard"));
		
		System.out.println("listAll: " + productService.listAll());
		
		//Test transaction rollback (duplicated key)
		
		try {
			productService.addAll(Arrays.asList(new Product(3, "Book"), new Product(4, "Soap"), new Product(1, "Computer")));
		} catch (DataAccessException dataAccessException) {
		}
		
		//Test element list after rollback
		System.out.println("listAll: " + productService.listAll());
		
		ctx.close();
		
	}
}
