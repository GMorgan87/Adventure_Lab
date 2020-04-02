package items;

import behaviours.IDefend;

public class Dragon implements IDefend {

    private int hitPoints;

    public Dragon(){
        this.hitPoints = 15;
    }

    public int getHitPoints() {
        return  hitPoints;
    }
}
