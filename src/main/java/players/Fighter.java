package players;

import behaviours.IWeapon;
import players.Player;

import java.util.ArrayList;

public class Fighter extends Player implements IWeapon {

    private ArrayList<IWeapon> weapons;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void Attack() {

    }
}
