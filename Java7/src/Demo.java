import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {

        ElementVisitor visitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("vivodJson.json");
        List<DataElement> list = new ArrayList<>();

        Character character = new Character("Bogey",
                RaceFactory.getRace(new HobgoblinFactory(), "Hobgobling"));

        character.setAtributes(Stats.generate());
        character.addRaceBonuses();

        list.add(character);
        list.add(character.getRace());
        list.add (character.getAtributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.access(visitor));
        }

        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();


        Character character2=new Character("Nedwyn",
                RaceFactory.getRace(new HalflingFactory(), "Halfling"));
        character2.setAtributes(Stats.generate());
        character2.addRaceBonuses();

        list.add(character2);
        list.add(character2.getRace());
        list.add(character2.getAtributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.access(visitor));
        }

        file.write(" , ");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();
    }
}