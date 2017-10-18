package part_1.head_04.annotation.com.springinaction.spring_idol.bonus_robot_java_config.dance;

public class Tango implements Dance {
    private String nameDance;

    public Tango() {
    }

    @Override
    public void style() {
        System.out.println(nameDance);
    }

    public String getNameDance() {
        return nameDance;
    }

    public void setNameDance(String nameDance) {
        this.nameDance = nameDance;
    }
}
