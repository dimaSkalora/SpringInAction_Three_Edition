package part_1.head_01.head_1_1.com.springinaction.knights;

public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest) {// Внедрение сценария подвига
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
        System.out.println("embarkOnQuest");
    }
}
