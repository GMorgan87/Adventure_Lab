import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Player knight;

    @Before
    public void before(){
        troll = new Troll(20, 5);
        knight = new Knight("Roosa", 20);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(10);
        assertEquals(10, troll.getHealthPoints());
    }

    @Test
    public void canAttackPlayer(){
        troll.attack(knight);
        assertEquals(15, knight.getHealthPoints());
    }

}
