package part_1.head_03.springinaction.spring_idol.parent.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_03.springinaction.spring_idol.parent.Performer;
import part_1.head_03.springinaction.spring_idol.parent.exception.PerformanceException;

public class ApplicationContext_Magician {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext conatext = new ClassPathXmlApplicationContext("Part_1-resources/Head_03/spring-idol_parent.xml");
        Performer magician = (Performer)conatext.getBean("harry");
        magician.perform();


    }
}
