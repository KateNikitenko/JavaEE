public abstract class CharacterClass {
    protected String name;
    protected int dice;

    public abstract void printMagic();
    public abstract void printDice();

    public int getDice(){
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    @Override
    public String toString() {
        return "Class: " + name + "; uses "+ dice + "D dice to roll hp";
    }
}