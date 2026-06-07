package character;

public class Assassin extends Hero {

    public Assassin(String name) {
        super(name, 1800, 250);
    }

    @Override
    public void useSkill() {
        System.out.println(name + " using Shadow Slash!");
    }
}