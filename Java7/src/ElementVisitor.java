import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor{
    public TreeMap visit (Character character){
        TreeMap jobj = new TreeMap();
        jobj.put("Name",character.getName());
        jobj.put("HP", character.getAtributes());
        return jobj;
    }

    public TreeMap visit (CharacterClass characterClass){
        TreeMap jobj = new TreeMap();
        jobj.put("Name",characterClass.toString());
        return jobj;
    }

    public TreeMap visit(CharacterRace characterRace){
        TreeMap jobj = new TreeMap();
        jobj.put("Race", characterRace.toString());
        return jobj;
    }

    public TreeMap visit (Stats stats){
        TreeMap jobs = new TreeMap();
        jobs.put("Atributes", stats.getAttrib());
        return jobs;
    }
}