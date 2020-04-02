package items;

import behaviours.ISpell;

public class Fireball implements ISpell {

    int hitPoints;

    public Fireball(){
       this.hitPoints = 10;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
