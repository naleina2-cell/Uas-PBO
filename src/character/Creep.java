package character;

public class Creep {

    private String name;
    private int hp;

    public Creep(String name, int hp){
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