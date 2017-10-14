package part_1.head_02.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.springinaction.spring_idol.Performer;
import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

public class ApplicationContext_Hank {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext contextHank = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/spring-idol.xml");
        Performer performerHankCollection = (Performer)contextHank.getBean("hankCollection");
        performerHankCollection.perform();

        Performer performerHankMap = (Performer)contextHank.getBean("hankMap");
        performerHankMap.perform();

        Performer performerHankProperties = (Performer)contextHank.getBean("hankProperties");
        performerHankProperties.perform();
    }
}
