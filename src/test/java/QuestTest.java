import behaviours.IWeapon;
import enemies.Troll;
import items.Sword;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import players.Fighter;
import players.Fighter;
import players.Knight;
import quests.Exit;
import quests.Quest;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest quest;
    Knight knight;
    IWeapon weapon;
    Troll troll;

    @Before
    public void before(){
        quest = new Quest();
        knight = new Knight("Roosa", 20);
        weapon = new Sword();
        knight.setWeapons(weapon);
        troll = new Troll(20, 15);
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

    @Test
    public void canFight(){
        System.out.println(quest.fight(knight, troll));
    }

}
