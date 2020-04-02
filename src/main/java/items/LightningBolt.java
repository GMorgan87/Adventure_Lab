package items;

import behaviours.ISpell;

public class LightningBolt implements ISpell {

    int hitPoints;

    public LightningBolt(){
        this.hitPoints = 12;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
