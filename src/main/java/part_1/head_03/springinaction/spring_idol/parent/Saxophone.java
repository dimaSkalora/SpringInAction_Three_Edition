package part_1.head_03.springinaction.spring_idol.parent;

public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
