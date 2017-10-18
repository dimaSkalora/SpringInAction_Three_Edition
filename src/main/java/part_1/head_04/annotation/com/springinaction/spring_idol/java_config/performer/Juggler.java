package part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer;

import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.exceptiion.PerformanceException;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING "+beanBags+" BEANBAGS");
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }
}
