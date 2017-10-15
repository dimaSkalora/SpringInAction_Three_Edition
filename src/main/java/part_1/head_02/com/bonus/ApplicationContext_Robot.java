package part_1.head_02.com.bonus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_1.head_02.com.bonus.robot.Robot;

public class ApplicationContext_Robot {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Part_1-resources/Head_02/bonus_robot.xml");
        Robot robot_modelT800 = (Robot)context.getBean("modelT800");
        robot_modelT800.action();
        robot_modelT800.dance();
    }
}
