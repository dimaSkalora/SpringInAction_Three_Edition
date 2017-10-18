package part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.robot.Robot;

public class ApplicationContext_Robot_JavaConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringRobotConfig.class);
        Robot modelT800 = (Robot)context.getBean("robotModelT800");
        modelT800.action();
        modelT800.dance();
    }
}
