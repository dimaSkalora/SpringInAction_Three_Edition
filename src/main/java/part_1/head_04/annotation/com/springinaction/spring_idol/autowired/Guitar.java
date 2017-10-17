package part_1.head_04.annotation.com.springinaction.spring_idol.autowired;

@StringedInstrument
@Strummed
public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Strum strum strum");
    }
}
