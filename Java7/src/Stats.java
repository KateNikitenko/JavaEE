import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Stats implements DataElement{
    private Map<String, Integer> attrib;

    public Stats(int s, int d, int c, int i, int w, int ch) {
        this.attrib = new HashMap<String, Integer>();
        this.attrib.put("Strength", s);
        this.attrib.put("Dexterity", d);
        this.attrib.put("Constitution", c);
        this.attrib.put("Intelligence", i);
        this.attrib.put("Wisdom", w);
        this.attrib.put("Charisma", ch);
    }

    public Map<String, Integer> getAttrib() {
        return attrib;
    }

    public void setAttrib(Map<String, Integer> attrib) {
        this.attrib = attrib;
    }

    public static Stats generate() {
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat());
    }

    public void printStats() {
        System.out.println("Atribute :" +
                "\n Strength -> " + this.attrib.get("Strength") +
                "\n Dexterity -> " + this.attrib.get("Dexterity") +
                "\n Constitution -> " + this.attrib.get("Constitution") +
                "\n Intelligence -> " + this.attrib.get("Intelligence") +
                "\n Wisdom -> " + this.attrib.get("Wisdom") +
                "\n Charisma -> " + this.attrib.get("Charisma"));
    }

    public Memento save() {
        return new Memento(attrib);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.attrib = memento.attrib;
    }

    private class Memento {

        private Map<String, Integer> attrib;
        Memento(Map<String, Integer> attrib) {
            this.attrib = attrib;
        }
    }
    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}