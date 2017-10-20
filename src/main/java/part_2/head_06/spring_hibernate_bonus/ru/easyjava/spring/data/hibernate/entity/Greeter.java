package part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Greeting entity.
 */
@SuppressWarnings("PMD")
@Entity
public class Greeter {
    /**
     * Primary key.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Greeting.
     */
    private String greeting;

    /**
     * Greeting target.
     */
    private String target;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
