package part_1.head_03.springinaction.spring_idol.parent.magic;

public class MagicBoxImpl implements MagicBox {
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant"; // Симпатичная ассистентка в ящике
    }
}
