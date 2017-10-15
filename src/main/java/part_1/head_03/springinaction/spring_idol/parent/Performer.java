package part_1.head_03.springinaction.spring_idol.parent;

import part_1.head_03.springinaction.spring_idol.parent.exception.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
