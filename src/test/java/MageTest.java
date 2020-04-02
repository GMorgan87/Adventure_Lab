import org.junit.Before;
import org.junit.Test;
import players.Mage;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage;

    @Before
    public void before(){
        mage = new Mage("Alan", 15);
    }

    @Test
    public void hasName(){
        assertEquals("Alan", mage.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(15, mage.getHealthPoints());
    }
}
