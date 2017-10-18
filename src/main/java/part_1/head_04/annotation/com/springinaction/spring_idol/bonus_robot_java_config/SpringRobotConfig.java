package part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.dance.Dance;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.dance.Tango;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.robot.ModelT800;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.robot.Robot;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.weapon.Pistol;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.weapon.Weapons;

@Configuration
public class SpringRobotConfig {
    @Bean
    Dance tangoRobot(){
        Tango tango = new Tango();
        tango.setNameDance("Tango");
        return tango;
    }

    @Bean
    Weapons pistolRobot(){
        Pistol pistol = new Pistol();
        pistol.setNameWeapons("Pistol");
        return pistol;
    }

    @Bean
    public Robot robotModelT800(){
        ModelT800 modelT800 = new ModelT800();
        modelT800.setNameRobot("Robot ModelT800");
        modelT800.setDance(tangoRobot());
        modelT800.setWeapons(pistolRobot());
        return modelT800;
    }
}
