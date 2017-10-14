package part_1.head_02.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.springinaction.spring_idol.Performer;
import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

public class ApplicationContext_Carl {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext contextCarl = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/spring-idol.xml");
        Performer performerCarl = (Performer)contextCarl.getBean("carl");
        performerCarl.perform();

    }
}
