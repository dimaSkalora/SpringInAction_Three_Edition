package part_1.head_04.annotation.com.springinaction.spring_idol.component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_04.annotation.com.springinaction.spring_idol.component_scan.exceptiion.PerformanceException;

public class ApplicationContext_EddieValue {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_04/Annotation/spring-idol_annotation.xml");
        Performer performerEddieComponent = (Performer)context.getBean("eddieComponent");
        performerEddieComponent.perform();
    }
}
