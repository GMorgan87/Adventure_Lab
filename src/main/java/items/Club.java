package items;
import behaviours.IWeapon;

public class Club implements IWeapon {
    private int hitPoints;

    public Club(){
        this.hitPoints = 10;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
