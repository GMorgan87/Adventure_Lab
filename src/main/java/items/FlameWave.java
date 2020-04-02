package items;

import behaviours.ISpell;

public class FlameWave implements ISpell {

    int hitPoints;

    public FlameWave(){
        this.hitPoints = 20;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
