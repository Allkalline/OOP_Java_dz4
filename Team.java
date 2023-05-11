import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior> {
    List<T> team = new ArrayList<>();
    
    public Team<T> addWarriors(T warrior){
        team.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for (T t : team) {
            warriors.append(t);
            warriors.append("\n");
        }
        warriors.append(String.format("HP: %s, max damage %d, max range %d, min Shield %s", healPoints(), getDamage(),
                                        maxRange(), minShield() ));
        return warriors.toString();
    }

    public int healPoints(){
        int sum = 0;
        for (T t : team) {
            sum += t.getHealtPoint();
        }
        return sum;
    }

    public int getDamage(){
        int sum = 0;
        for (T t : team) {
            sum += t.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for (T t : team) {
            if(t instanceof Arcer){
                if(max< ((Arcer)t).range()){
                    max = ((Arcer)t).range();
                }
            }
        }
        return max;
    }

    public int minShield(){
       int max = 0;
       for (T t : team) {
        if(max<t.getShield().protection()) max = t.getShield().protection();
       }
       int min = max;
       for (T t : team) {
        if(min>t.getShield().protection()) min = t.getShield().protection();
       }

       return min;

    }
}
