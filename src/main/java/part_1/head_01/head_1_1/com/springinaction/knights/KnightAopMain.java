package part_1.head_01.head_1_1.com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightAopMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_1-resources/Head_01/Head_1_1/knights-aop.xml");

        Knight knight = (Knight) context.getBean("knight");

        try {
            knight.embarkOnQuest();
        } catch (QuestException e) {
            e.printStackTrace();
        }
    }
}
