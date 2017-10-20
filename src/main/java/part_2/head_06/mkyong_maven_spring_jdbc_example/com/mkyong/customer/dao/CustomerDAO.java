package part_2.head_06.mkyong_maven_spring_jdbc_example.com.mkyong.customer.dao;

import part_2.head_06.mkyong_maven_spring_jdbc_example.com.mkyong.customer.model.Customer;

public interface CustomerDAO {
    void insert(Customer customer);
    Customer findByCustomerId(int custId);
}
