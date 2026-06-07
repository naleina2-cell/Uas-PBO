package character;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int attack;

    public Hero(
            String name,
            int hp,
            int attack
    ){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public abstract void useSkill();

    public void basicAttack(){

        System.out.println(
                name +
                " attacking you!"
        );
    }
}