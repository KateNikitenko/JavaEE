public class Demo {
    public static void main(String[] args) {
        Character character = new Character("Bogey",
                RaceFactory.getRace(new HobgoblinFactory(), "Hobgobling"));
        character.setAtributes(Stats.generate());
        character.addRaceBonuses();
        character.printAll();
        character.talk();

        System.out.println("-------------");

        Character character2 = new Character("Nedwyn",
                RaceFactory.getRace(new HalflingFactory(), "Halfling"));
        character2.setAtributes(Stats.generate());
        character2.addRaceBonuses();
        character2.printAll();
        character2.talk();

    }
}