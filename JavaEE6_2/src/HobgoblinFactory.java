import java.util.HashMap;
public class HobgoblinFactory implements RaceAbstractFactory{
    HashMap<String,Stats> hobgoblinTypes=new HashMap<>();

    public Hobgobling create(String type) {
        if(hobgoblinTypes.isEmpty()){
            hobgoblinTypes.put("Hobgobling", new Stats(0, 0, 2, 1, 0, 0));
        }
        return new Hobgobling(type,hobgoblinTypes.get(type));
    }

}