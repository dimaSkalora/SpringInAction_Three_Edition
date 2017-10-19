package part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.exception.PerformanceException;
import part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.perfomer.Performer;

public class ApplicationContext_SpringIdolAround {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_05/Annotation_AspectJ/spring-idol-around.xml");

        Performer performerEddie = (Performer)context.getBean("eddie");
        performerEddie.perform();
    }
}
