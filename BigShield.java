public class BigShield implements Shield {

    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("BigShield, max protection %d", protection());
    }
    
}
