package part_test_1.head_01.head_1_1.com.springinaction.knights;

import org.junit.Test;
import part_1.head_01.head_1_1.com.springinaction.knights.BraveKnight;
import part_1.head_01.head_1_1.com.springinaction.knights.Quest;
import part_1.head_01.head_1_1.com.springinaction.knights.QuestException;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class); // Создание фиктивного объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest); // Внедрение
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
