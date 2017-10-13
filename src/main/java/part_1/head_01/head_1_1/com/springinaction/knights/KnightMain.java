package part_1.head_01.head_1_1.com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_01/Head_1_1/knights.xml");        // Получение компонента knight
        Knight knight = (Knight)context.getBean("knight");
        // Использование компонента knight
        try {
            knight.embarkOnQuest();
        } catch (QuestException e) {
            e.printStackTrace();
        }
    }
}
