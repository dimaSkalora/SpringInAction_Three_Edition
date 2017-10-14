package part_1.head_02.com.springinaction.spring_idol;

public class Saxophone implements Instrument{
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
