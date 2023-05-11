import java.util.Random;

public class Arcer extends Warrior<Bow>  {

    public Arcer(String name, Bow bow, SmallShield smallShield, int healtPoint) {
        super(name, bow, smallShield, healtPoint);
        
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }
    @Override
    public String toString() {
        return String.format("Archer %s,", super.toString());
    }
    
}
