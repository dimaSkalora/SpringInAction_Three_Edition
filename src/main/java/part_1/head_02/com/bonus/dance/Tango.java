package part_1.head_02.com.bonus.dance;

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
