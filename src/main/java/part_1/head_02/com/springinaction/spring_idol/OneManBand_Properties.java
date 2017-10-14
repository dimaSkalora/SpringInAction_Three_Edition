package part_1.head_02.com.springinaction.spring_idol;

import part_1.head_02.com.springinaction.spring_idol.exception.PerformanceException;

import java.util.Properties;

public class OneManBand_Properties implements Performer {
    private Properties instruments;

    public OneManBand_Properties() {
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("---Properties---");
        System.out.println("GUITAR" + " : "+instruments.getProperty("GUITAR"));
        System.out.println("CYMBAL" + " : "+instruments.getProperty("CYMBAL"));
        System.out.println("HARMONICA" + " : "+instruments.getProperty("HARMONICA"));

    }
}
