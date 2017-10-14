package part_1.head_02.com.springinaction.spring_idol;

import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

import java.util.Map;

public class OneManBand_Map implements Performer {
    private Map<String, Instrument> instruments;

    public OneManBand_Map() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("---Map---");
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде отображения (Map)
    }
}
