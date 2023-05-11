public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two; 
    }

    public Warrior fight(){
        System.out.println("Здоровье первого воина: " + one.getHealtPoint());
        System.out.println("Здоровье второго воина: " + two.getHealtPoint());
        while (one.getHealtPoint()>0 && two.getHealtPoint()>0){
            int hitOne = one.hit();
            int blockTwo = two.block();
            System.out.printf("Первый воин нанес %s, Урона заблокировано %s \n", hitOne, blockTwo);
            two.setHealtPoint(two.getHealtPoint()-hitOne+blockTwo);
            System.out.printf("Здоровье второго воина: %s \n", two.getHealtPoint());
            if(two.getHealtPoint()<=0){
                return one;
            } 
            int hitTwo = two.hit();
            int blockOne = one.block();
            System.out.printf("Второй воин нанес %s, Урона заблокировано %s \n", hitTwo, blockOne);
            one.setHealtPoint(one.getHealtPoint()-hitTwo+blockOne);
            System.out.printf("Здоровье первого воина: %s \n", one.getHealtPoint());
            }
            return two;
        }
    }

