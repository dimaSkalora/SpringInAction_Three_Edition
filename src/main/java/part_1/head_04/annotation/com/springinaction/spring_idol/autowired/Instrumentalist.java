package part_1.head_04.annotation.com.springinaction.spring_idol.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import part_1.head_04.annotation.com.springinaction.spring_idol.autowired.exceptiion.PerformanceException;

public class Instrumentalist implements Performer{
    private String song;
    @Autowired
    //@Qualifier("guitar")
    @StringedInstrument
    @Strummed
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
