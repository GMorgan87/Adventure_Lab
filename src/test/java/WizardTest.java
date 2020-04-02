import enemies.Troll;
import items.Dragon;
import items.Fireball;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fireball fireball;
    Troll troll;
    Dragon dragon;

    @Before
    public void before(){
        fireball = new Fireball();
        troll = new Troll(20, 5);
        dragon = new Dragon();
        wizard = new Wizard("Alan", 15, fireball, dragon);
    }

    @Test
    public void hasName(){
        assertEquals("Alan", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(15, wizard.getHealthPoints());
    }
}
