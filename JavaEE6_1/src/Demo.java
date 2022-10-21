public class Demo {
    public static void main(String[] args){
        Character character = new Character(" Abudabi ", ClassFactory.getClass("Bard"));
        character.setAtributes(Stats.generate());
        character.addRaceBonuses();
        character.talk();

        System.out.println("\n------------------------");

        Character character2 = new Character(" Genshtein ", ClassFactory.getClass("Ranger"));
        character2.setAtributes(Stats.generate());
        character2.addRaceBonuses();
        character2.talk();
    }
}