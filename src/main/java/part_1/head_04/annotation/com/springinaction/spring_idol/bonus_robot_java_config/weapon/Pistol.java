package part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.weapon;

public class Pistol implements Weapons {
    private String nameWeapons;

    public Pistol() {
    }

    @Override
    public void shoot() {
        System.out.println(nameWeapons+" Пих Пах");
    }

    public String getNameWeapons() {
        return nameWeapons;
    }

    public void setNameWeapons(String nameWeapons) {
        this.nameWeapons = nameWeapons;
    }
}
