package items;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int hitPoints;

    public Sword(){
        this.hitPoints = 15;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
