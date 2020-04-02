package players;

import behaviours.ISpell;
import enemies.Enemy;

public class Mage extends Player{

    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void castSpell(ISpell spell, Enemy enemy){
        enemy.takeDamage(spell.getHitPoints());
    }

}
