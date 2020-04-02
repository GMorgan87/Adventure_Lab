package players;

import behaviours.IWeapon;
import enemies.Enemy;
import players.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Random;

public class Fighter extends Player{

    private IWeapon weapons;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public IWeapon getWeapons() {
        return weapons;
    }

    public void setWeapons(IWeapon weapons) {
        this.weapons = weapons;
    }

    public void attack(IWeapon weapon, Enemy enemy) {
        int attackPoints = (int) (Math.random() * weapon.getHitPoints());
        enemy.takeDamage(attackPoints);
    }

}
