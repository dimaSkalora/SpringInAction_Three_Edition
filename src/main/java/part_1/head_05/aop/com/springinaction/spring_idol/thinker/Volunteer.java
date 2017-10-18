package part_1.head_05.aop.com.springinaction.spring_idol.thinker;

public class Volunteer implements Thinker {
    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
