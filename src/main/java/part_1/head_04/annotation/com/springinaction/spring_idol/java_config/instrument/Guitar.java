package part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument;

public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Breenn Breenn Breenn");
    }
}
