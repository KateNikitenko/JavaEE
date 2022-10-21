import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    static int min = 1;
    static int max = 6;

    public static int roll() {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    public static int rollStat() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            list.add(roll());
        }

        Collections.sort(list, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += list.get(i);
        }
        return sum;
    }

}