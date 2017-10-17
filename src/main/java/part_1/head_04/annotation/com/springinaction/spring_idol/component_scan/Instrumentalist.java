package part_1.head_04.annotation.com.springinaction.spring_idol.component_scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import part_1.head_04.annotation.com.springinaction.spring_idol.component_scan.exceptiion.PerformanceException;

@Component("eddieComponent")
public class Instrumentalist implements Performer {
    @Value("Running with the Devil")
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }

    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }
}
