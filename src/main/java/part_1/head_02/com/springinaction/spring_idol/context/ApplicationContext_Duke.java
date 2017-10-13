package part_1.head_02.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.springinaction.spring_idol.Performer;
import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

public class ApplicationContext_Duke {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/springidol-context.xml");
        Performer performer = (Performer)ctx.getBean("duke");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
