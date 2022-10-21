import java.util.HashMap;

public class HalflingFactory implements RaceAbstractFactory {

    HashMap<String, Stats> halflingTypes = new HashMap<>();

    public Halfling create(String type) {
        if (halflingTypes.isEmpty()) {
            halflingTypes.put("Halfling", new Stats(0, 2, 1, 0, 0, 0));
        }
        return new Halfling(type, halflingTypes.get(type));
    }
}