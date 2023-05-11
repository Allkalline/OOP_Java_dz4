public class SmallShield implements Shield {

    @Override
    public int protection() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("SmallShield, max protection %d", protection());
    }
}
