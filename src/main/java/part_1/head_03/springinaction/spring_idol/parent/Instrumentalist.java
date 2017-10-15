package part_1.head_03.springinaction.spring_idol.parent;

import part_1.head_03.springinaction.spring_idol.parent.exception.PerformanceException;

public class Instrumentalist implements Performer {
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

    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }
}
