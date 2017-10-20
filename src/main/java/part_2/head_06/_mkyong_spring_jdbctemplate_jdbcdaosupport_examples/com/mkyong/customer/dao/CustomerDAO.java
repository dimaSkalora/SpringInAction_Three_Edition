package part_2.head_06._mkyong_spring_jdbctemplate_jdbcdaosupport_examples.com.mkyong.customer.dao;

import part_2.head_06._mkyong_spring_jdbctemplate_jdbcdaosupport_examples.com.mkyong.customer.model.Customer;

import java.util.List;

public interface CustomerDAO {
    public void insert(Customer customer);

    public void insertNamedParameter(Customer customer);

    public void insertBatch(List<Customer> customer);

    public void insertBatchNamedParameter(List<Customer> customer);

    public void insertBatchNamedParameter2(List<Customer> customer);

    public void insertBatchSQL(String sql);

    public Customer findByCustomerId(int custId);

    public Customer findByCustomerId2(int custId);

    public List<Customer> findAll();

    public List<Customer> findAll2();

    public String findCustomerNameById(int custId);

    public int findTotalCustomer();

}
