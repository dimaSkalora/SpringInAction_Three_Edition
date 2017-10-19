package part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.contestant;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {
    @DeclareParents( // Внедрение интерфейса Contestant
            value = "part_1.head_05.annotation_aspectj.com.springinaction.spring_idol.perfomer.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}
