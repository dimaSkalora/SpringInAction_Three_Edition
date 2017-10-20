package part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.dao;

import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.entity.Greeter;

import java.util.List;

/**
 * Database layer.
 */
public interface GreeterDao {
    /**
     * Adds some greet to the database.
     * @param g Greeting data.
     */
    void addGreet(Greeter g);

    /**
     * Returns all greetings.
     * @return List with all greetings in the database.
     */
    List<Greeter> getGreetings();
}
