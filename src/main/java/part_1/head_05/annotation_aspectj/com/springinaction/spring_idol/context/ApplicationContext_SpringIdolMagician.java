package part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.exception.PerformanceException;
import part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.thinker.Thinker;

public class ApplicationContext_SpringIdolMagician {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_05/Annotation_AspectJ/sneaky-magician.xml");

        Thinker thinker = (Thinker)context.getBean("volunteer");
        thinker.thinkOfSomething("hihi haha");
    }
}
