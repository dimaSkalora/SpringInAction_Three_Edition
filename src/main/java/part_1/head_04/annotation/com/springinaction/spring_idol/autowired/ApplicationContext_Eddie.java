package part_1.head_04.annotation.com.springinaction.spring_idol.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_04.annotation.com.springinaction.spring_idol.autowired.exceptiion.PerformanceException;

public class ApplicationContext_Eddie {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_04/Annotation/spring-idol_annotation.xml");
        Performer performerEddie = (Performer)context.getBean("eddie");
        performerEddie.perform();
    }
}
