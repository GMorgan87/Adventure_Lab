package players;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;

public class Warlock extends Mage {

    private ISpell spell;
    private IDefend defender;

    public Warlock(String name, int healthPoints, ISpell spell, IDefend defender) {
        super(name, healthPoints);
        this.spell = spell;
        this.defender = defender;
    }

    public void attack(ISpell spell, Enemy enemy){
        enemy.takeDamage(spell.getHitPoints());
    }

    public void defend(IDefend defender, Enemy enemy){
        enemy.takeDamage(defender.getHitPoints());
    }
}
