package part_1.head_04.annotation.com.springinaction.spring_idol.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.exceptiion.PerformanceException;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument.Instrument;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer.Performer;

public class ApplicationContext_Java_Config {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIdolConfig.class);
        System.out.println("-----duke-----");
        Performer performerDuke = (Performer)context.getBean("duke");
        performerDuke.perform();
        System.out.println("-----duke15-----");
        Performer performerDuke15 = (Performer)context.getBean("duke15");
        performerDuke15.perform();
        System.out.println("-----kenny-----");
        Performer performerKenny = (Performer)context.getBean("kenny");
        performerKenny.perform();
        System.out.println("-----poeticDuke-----");
        Performer performerPoeticDuke = (Performer)context.getBean("poeticDuke");
        performerPoeticDuke.perform();
        System.out.println("-----piano-----");
        Instrument piano = (Instrument) context.getBean("piano");
        piano.play();

    }
}
