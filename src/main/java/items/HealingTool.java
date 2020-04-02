package items;

import behaviours.IHeal;

public class HealingTool implements IHeal {

    private int healpoints;

    public HealingTool(int healpoints){
        this.healpoints = healpoints;
    }

    public int getHealPoints() {
        return healpoints;
    }

}
