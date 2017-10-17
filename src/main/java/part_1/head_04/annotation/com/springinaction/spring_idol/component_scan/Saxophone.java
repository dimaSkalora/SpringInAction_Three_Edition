package part_1.head_04.annotation.com.springinaction.spring_idol.component_scan;

@SkipIt
public class Saxophone implements Instrument{
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
