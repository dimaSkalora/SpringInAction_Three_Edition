package part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.instrument;

public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Breenn Breenn Breenn");
    }
}
