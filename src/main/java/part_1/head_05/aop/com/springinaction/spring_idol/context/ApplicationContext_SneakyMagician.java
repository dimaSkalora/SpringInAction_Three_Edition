package part_1.head_05.aop.com.springinaction.spring_idol.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_05.aop.com.springinaction.spring_idol.exception.PerformanceException;
import part_1.head_05.aop.com.springinaction.spring_idol.mind_reader.MindReader;

public class ApplicationContext_SneakyMagician {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_05/sneaky-magician.xml");
        String s ="hihi";
        MindReader mindReader =(MindReader)context.getBean("magician");
        mindReader.interceptThoughts(s);
    }
}
