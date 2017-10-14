package part_1.head_02.com.springinaction.spring_idol;

public class Piano implements Instrument {
    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
