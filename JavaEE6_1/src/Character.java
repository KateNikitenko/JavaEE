import java.util.HashMap;
import java.util.Set;

public class Character  {

    private String name;
    private CharacterClass dndclass;
    private Stats chStats;


    public Character(String name, CharacterClass dndclass){
        this.name = name;
        this.dndclass = dndclass;
    }



    public void addRaceBonuses(){
        Set<String> key = this.chStats.getAttrib().keySet();
        dndclass.setDice(dndclass.getDice() + (int)Math.floor(this.chStats.getAttrib().get("Constitution") / 2 -5));
    }

    public void setAtributes(Stats atributes){
        this.chStats = atributes;
    }


    public void talk() {
        System.out.println("Character" + "name : " + name );
        dndclass.printDice();
        dndclass.printMagic();
        chStats.printStats() ;
    }


}