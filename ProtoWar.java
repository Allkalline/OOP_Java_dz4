public class ProtoWar extends Warrior <Knife> {

    public ProtoWar(String name, Knife knife, BigShield bigShield, int healtPoint) {
        super(name, knife, bigShield, healtPoint);
        
    }


    @Override
    public String toString() {
        return String.format("ProtoWar %s", super.toString());
    }
    

    
}
