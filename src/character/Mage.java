package character;

public class Mage extends Hero {

    public Mage(
            String name
    ){
        super(
                name,
                1600,
                180
        );
    }

    @Override
    public void useSkill(){

        System.out.println(
                name +
                " using Magic Burst!"
        );
    }
}