public class main {
    public static void main(String[] args) {
        // Team<Arcer> archersTeam = new Team<>();
        // archersTeam.addWarriors(new Arcer("George",  new Bow(), new SmallShield(),  30))
        //             .addWarriors(new Arcer("Bob", new Bow(), new SmallShield(), 25));

        // Team<Assasin> assasinTeam = new Team<>();
        // assasinTeam.addWarriors(new Assasin("Altair", new Knife(), new NoShield(), 35))
        //             .addWarriors(new Assasin("Ecio", new Knife(), new NoShield(), 20));
    
    // System.out.println(archersTeam);
    // System.out.println("-------------");
    // System.out.println(assasinTeam);


    // Battle battle = new Battle(new ProtoWar("Hero1", new Knife(), new BigShield(), 30),
    // new Arcer("Hero2", new Bow(), new SmallShield(), 20));
    // Warrior winner = battle.fight();
    // System.out.println("Победил: " + winner);
    

    // Battle battle = new Battle(new Assasin("Altair", new Knife(), new NoShield(), 35),
    //     new Arcer("Bob", new Bow(), new SmallShield(), 25));
    //      Warrior winner = battle.fight();
    //      System.out.println("Победил: " + winner);

    Team<Warrior> team = new Team<>();
    team.addWarriors(new ProtoWar("Hero1", new Knife(), new BigShield(), 30))
        .addWarriors(new Arcer("Hero2", new Bow(), new SmallShield(), 20))
        .addWarriors(new Assasin("Hero3", new Knife(), new NoShield(),25));

        System.out.println(team);




    
    
    
    }

}
