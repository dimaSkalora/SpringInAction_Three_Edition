package part_1.head_01.head_1_1.com.springinaction.knights;

public class DamselRescuingKnight implements Knight{
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
