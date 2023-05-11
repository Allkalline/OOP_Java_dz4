import java.util.Random;

public abstract class Warrior <T extends Weapon> {
    private String name;
    protected Shield shield;


    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    protected T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    private int healtPoint;
    

    public void setHealtPoint(int healtPoint) {
        this.healtPoint = healtPoint;
    }

    public int getHealtPoint() {
        return healtPoint;
    }

    public Warrior(String name, T weapon, Shield shield, int healtPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healtPoint = healtPoint;
    }

    @Override
    public String toString() {
        return String.format("Name %s, Weapon %s, Shield %s, HP %d", name, weapon, shield, healtPoint);
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int block(){
        Random random = new Random();
        if (shield.protection() != 0)
        return random.nextInt(shield.protection());
        else return 0;
    }

    

    
}
