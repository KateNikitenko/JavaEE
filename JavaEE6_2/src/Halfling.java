public class Halfling extends CharacterRace {

    Halfling(String name, Stats stat) {
        this.name = name;
        this.bonuses = stat;
    }

    @Override
    public void saySMTH() {
        System.out.println("Reparo");
    }

}
