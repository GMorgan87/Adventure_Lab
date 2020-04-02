package enemies;

import players.Player;

public class Enemy {

    private int healthPoints;
    private int hitPoints;

    public Enemy(int healthPoints, int hitPoints)  {
        this.healthPoints = healthPoints;
        this.hitPoints = hitPoints;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void attack(Player player){
        int attackPoints = (int) (Math.random() * this.hitPoints);
        player.takeDamage(attackPoints);
    }
}
