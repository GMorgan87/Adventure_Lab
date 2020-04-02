package players;

import behaviours.IHeal;
import items.HealingTool;
import players.Player;

public class Cleric extends Player implements IHeal {

    private HealingTool healingTool;

    public Cleric(String name, int healthPoints, HealingTool healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public void heal() {

    }
}
