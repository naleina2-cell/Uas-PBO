package character;

public class Minion {

    private String name;
    private int hp;

    public Minion(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }
}