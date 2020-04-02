package items;

import behaviours.IWeapon;

public class Axe implements IWeapon {

    private int hitPoints;

    public Axe(){
        this.hitPoints = 12;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
