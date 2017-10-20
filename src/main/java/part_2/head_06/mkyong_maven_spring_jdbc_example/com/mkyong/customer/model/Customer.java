package part_2.head_06.mkyong_maven_spring_jdbc_example.com.mkyong.customer.model;

public class Customer {

        int custId;
        String name;
        int age;
        //getter and setter methods


    public Customer() {
    }

    public Customer(int custId, String name, int age) {
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
