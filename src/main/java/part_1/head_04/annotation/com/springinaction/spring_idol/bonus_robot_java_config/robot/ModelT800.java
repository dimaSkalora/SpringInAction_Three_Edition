package part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.robot;

import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.dance.Dance;
import part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.weapon.Weapons;

public class ModelT800 implements Robot {
    private String nameRobot;
    private Weapons weapons;
    private Dance dance;

    public ModelT800() {
    }

    @Override
    public void dance() {
        System.out.println(getNameRobot());
        System.out.println("Стиль танца");
        dance.style();
    }

    @Override
    public void action() {
        System.out.println(getNameRobot());
        System.out.println("Цель человек");
        weapons.shoot();
    }

    public String getNameRobot() {
        return nameRobot;
    }

    public void setNameRobot(String nameRobot) {
        this.nameRobot = nameRobot;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Dance getDance() {
        return dance;
    }

    public void setDance(Dance dance) {
        this.dance = dance;
    }
}
