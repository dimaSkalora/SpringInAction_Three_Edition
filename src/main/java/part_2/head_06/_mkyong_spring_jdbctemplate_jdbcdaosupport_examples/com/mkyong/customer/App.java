package part_2.head_06._mkyong_spring_jdbctemplate_jdbcdaosupport_examples.com.mkyong.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_06._mkyong_spring_jdbctemplate_jdbcdaosupport_examples.com.mkyong.customer.dao.CustomerDAO;
import part_2.head_06._mkyong_spring_jdbctemplate_jdbcdaosupport_examples.com.mkyong.customer.model.Customer;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_2-resources/Head_06/mkyong-spring-jdbctemplate-jdbcdaosupport-examples/Spring-CustomerJdbcTemplate.xml");

        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer("mkyong",28);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(2);
        System.out.println(customer1);

    }
}
