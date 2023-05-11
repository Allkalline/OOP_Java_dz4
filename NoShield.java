public class NoShield implements Shield {

    @Override
    public int protection() {
       return 0;
    }
    public String toString() {
        return String.format("NoShield, max protection %d", protection());
    }
    
}
