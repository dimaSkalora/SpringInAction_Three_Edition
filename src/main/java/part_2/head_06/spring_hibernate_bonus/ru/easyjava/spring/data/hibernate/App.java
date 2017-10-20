package part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.dao.GreeterDao;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.entity.Greeter;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.service.GreeterService;

/**
 * Simple example of JDBC usage.
 */
public final class App {
    /**
     * Do not construct me.
     */
    private App() {
    }

    /**
     * Entry point.
     *
     * @param args Command line args. Not used.
     */
    public static void main(final String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_2-resources/Head_06/spring-hibernate-bonus/applicationContext.xml");
        GreeterService greeterService = context.getBean(GreeterService.class);
        GreeterDao dao = context.getBean(GreeterDao.class);

        Greeter greeter = new Greeter();
        greeter.setGreeting("Hello");
        greeter.setTarget("World");

        dao.addGreet(greeter);

        System.out.println(greeterService.greet());

        System.exit(0);
    }
}
