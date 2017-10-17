package part_1.head_04.annotation.com.springinaction.spring_idol.component_scan;

import org.springframework.stereotype.Component;

//@Component
public class Piano implements Instrument {

    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
