import behaviours.IWeapon;
import enemies.Troll;
import items.Sword;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    IWeapon weapon;
    Troll troll;

    @Before
    public void before(){
        knight = new Knight("Roosa", 18);
        weapon = new Sword();
        troll = new Troll(20, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Roosa", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(18, knight.getHealthPoints());
    }

    @Test
    public void canSetWeapons(){
        knight.setWeapons(weapon);
        assertEquals(weapon, knight.getWeapons());
    }

    @Test
    public void canAttackEnemy(){
        knight.attack(weapon, troll);
        assertEquals(5, troll.getHealthPoints());
    }
}
