package enemies;

public class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints)  {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
