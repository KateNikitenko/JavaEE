import java.util.Set;

public class Character {
    private String name;

    private CharacterRace race;
    private Stats attributes;

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Stats getAtributes() {
        return attributes;
    }

    public void addRaceBonuses() {
        System.out.println("Recalculating attributes for " + this.race.toString());
        Set<String> key = this.attributes.getAttrib().keySet();
        for (String title : key) {
            int val = this.attributes.getAttrib().get(title) + this.race.getRaceBonuses().getAttrib().get(title);
            this.attributes.getAttrib().put(title, val);
        }
    }

    public void setAtributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void printAll() {
        System.out.println("Name: " + name);
        race.print();
        attributes.printStats();
    }

    public void talk() {
        race.saySMTH();
    }
}