package part_1.head_03.springinaction.spring_idol.parent;

import part_1.head_03.springinaction.spring_idol.parent.exception.PerformanceException;

public abstract class Instrumentalist_LookupMethod implements Performer {
    private Instrument instrument;
    private String song;

    public Instrumentalist_LookupMethod() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        getInstrument().play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument();
}
