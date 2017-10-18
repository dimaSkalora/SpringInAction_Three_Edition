package part_1.head_05.aop.com.springinaction.spring_idol.mind_reader;

public class Magician implements MindReader {
    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts=thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
