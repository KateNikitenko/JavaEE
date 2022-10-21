public class Hobgobling extends CharacterRace {

    Hobgobling(String name, Stats stat) {
        this.name = name;
        this.bonuses = stat;
    }

    @Override
    public void saySMTH() {
        System.out.println("Portus");
    }
}
