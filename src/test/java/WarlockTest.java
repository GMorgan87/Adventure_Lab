import behaviours.ISpell;
import enemies.Troll;
import items.Dragon;
import items.Fireball;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Fireball fireball;
    Troll troll;
    Dragon dragon;

    @Before
    public void before(){
        fireball = new Fireball();
        troll = new Troll(20, 5);
        dragon = new Dragon();
        warlock = new Warlock("Alan", 50, fireball, dragon);
    }

   @Test
    public void canAttackEnemy(){
        warlock.attack(fireball, troll);
        assertEquals(10, troll.getHealthPoints());
   }

   @Test
    public void canDefend(){
        warlock.defend(dragon, troll);
       assertEquals(5, troll.getHealthPoints());
   }


}
