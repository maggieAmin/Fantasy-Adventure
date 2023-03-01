package Enemies;

public class Enemies {
    private int healthPoints;
    private int killingPower;
    private String name;

    public Enemies(int healthPoints, int killingPower, String name) {
        this.healthPoints = healthPoints;
        this.killingPower = killingPower;
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getKillingPower() {
        return killingPower;
    }

    public String getName(){
        return name;
    }
}
