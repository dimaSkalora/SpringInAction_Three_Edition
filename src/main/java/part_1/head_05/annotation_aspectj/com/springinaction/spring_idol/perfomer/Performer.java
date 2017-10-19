package part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.perfomer;

import part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.exception.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
