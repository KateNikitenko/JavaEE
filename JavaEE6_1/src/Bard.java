import java.util.ArrayList;
import java.util.List;

public class Bard extends CharacterClass{

    private List<String> spells;

    public Bard(){
        this.name = "Bard";
        this.dice = 8;
        this.spells = new ArrayList<>();
        this.spells.add("Charm Person");
        this.spells.add("Heroism");
    }

    public void printDice(){
        System.out.println("Health = " + dice);
    }

    @Override
    public void printMagic() {
        System.out.println("Class " + name + " knows spells: ");
        for(String spell: spells){
            System.out.println(spell);
        }
    }
}