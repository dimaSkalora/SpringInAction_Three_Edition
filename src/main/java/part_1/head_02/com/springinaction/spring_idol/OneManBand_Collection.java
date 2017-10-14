package part_1.head_02.com.springinaction.spring_idol;

import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

import java.util.Collection;

//Исполнитель, который является человеком-оркестром
public class OneManBand_Collection implements Performer {
    private Collection<Instrument> instruments;

    public OneManBand_Collection() {
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;     //Внедрение коллекции инструментов
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("---Collection---");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
