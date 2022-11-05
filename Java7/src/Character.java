import java.util.Set;
import java.util.TreeMap;

public class Character implements DataElement{
    private String name;
    private CharacterRace race;
    private Stats attributes;
    private String dndclass;
    private int health;
    public Character(String name,  CharacterRace race) {
        this.name = name;
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public CharacterRace getRace() {
        return race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDndclass(String dndclass) {
        this.dndclass = dndclass;
    }

    public String getDndclass() {
        return dndclass;
    }

    public void setAtributes(Stats attributes) {
        this.attributes = attributes;
    }
    public Stats getAtributes() {
        return attributes;
    }

    public void addRaceBonuses() {
        System.out.println("Recalculating attributes for "+this.race.toString());
        Set<String> key=this.attributes.getAttrib().keySet();
        for(String title:key){
            int val = this.attributes.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.attributes.getAttrib().put(title, val);
        }
        this.health += Math.floor(this.attributes.getAttrib().get("Constitution")/2)-5;
    }

    public void printSheet(){
        System.out.println("Name: "+name );

        race.print();
        attributes.printStats();
    }

    public void talk(){
        race.saySMTH();
    }

    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}