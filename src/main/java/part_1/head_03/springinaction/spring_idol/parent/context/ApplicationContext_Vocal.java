package part_1.head_03.springinaction.spring_idol.parent.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_03.springinaction.spring_idol.parent.Performer;
import part_1.head_03.springinaction.spring_idol.parent.exception.PerformanceException;
import part_1.head_03.springinaction.spring_idol.parent.vocal.Vocal;

public class ApplicationContext_Vocal {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext conatext = new ClassPathXmlApplicationContext("Part_1-resources/Head_03/spring-idol_parent.xml");
        Performer performerSteveie = (Performer)conatext.getBean("stevie");
        performerSteveie.perform();

        Vocal vocalTaylor = (Vocal)conatext.getBean("taylor");
        vocalTaylor.playVocal();

    }
}
