package part_1.head_02.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.springinaction.spring_idol.Performer;
import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

public class ApplicationContext_PoeticDuke {
    public static void main(String[] args) {
        ApplicationContext context_poeticDuke = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/spring-idol.xml");
        Performer poeticDuke = (Performer)context_poeticDuke.getBean("poeticDuke");
        try {
            poeticDuke.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
