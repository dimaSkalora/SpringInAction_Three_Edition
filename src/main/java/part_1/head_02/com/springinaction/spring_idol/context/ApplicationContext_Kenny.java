package part_1.head_02.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.springinaction.spring_idol.Performer;
import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

public class ApplicationContext_Kenny {
    public static void main(String[] args) {
        ApplicationContext conatextKenny = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/spring-idol.xml");
        Performer performerKennySaxophone = (Performer)conatextKenny.getBean("kenny_saxophone");
        try {
            performerKennySaxophone.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }

        Performer performerKennyPiano = (Performer)conatextKenny.getBean("kenny_piano");
        try {
            performerKennyPiano.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }

        Performer performerKennySaxophone2 = (Performer)conatextKenny.getBean("kenny_saxophone2");
        try {
            performerKennySaxophone2.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
