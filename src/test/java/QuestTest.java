import org.junit.Before;
import org.junit.Test;
import quests.Exit;
import quests.Quest;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest quest;

    @Before
    public void before(){
        quest = new Quest();
    }

    @Test
    public void hasRooms(){
        assertEquals(5, quest.getRooms().size());
    }

    @Test
    public void reduceRoomsWhenExit(){
        Exit validExit = quest.getCurrentRoom().getExits().get(0);
        quest.chooseExit(validExit);
        assertEquals(4, quest.getRooms().size());
    }

}
