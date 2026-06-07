package character;

public class Tank extends Hero {

    public Tank(
            String name
    ){
        super(
                name,
                2500,
                150
        );
    }

    @Override
    public void useSkill(){

        System.out.println(
                name +
                " using Iron Shield!"
        );
    }
}