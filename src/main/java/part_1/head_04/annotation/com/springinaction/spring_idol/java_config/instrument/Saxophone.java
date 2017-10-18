package part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument;

public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
