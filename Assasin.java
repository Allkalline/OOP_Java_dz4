public class Assasin extends Warrior <Knife> {

    public Assasin(String name, Knife knife, NoShield noShield, int healtPoint) {
        super(name, knife, noShield, healtPoint);
        
    }


    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
    
}
