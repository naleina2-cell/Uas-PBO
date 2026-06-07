package battle;

public class Tower {
    private String name;
    private int hp;

    public Tower(String name, int hp){
        this.name = name;
        this.hp = 500;
    }

    public void takeDamage(int damage){
        hp -= damage;
        if (hp<0) hp = 0;
    }
    public boolean isDestroyed(){
        return hp <= 0;
    }
    public int getHp(){
        return hp;
    }
    public String getName(){
        return name;
    }

}
