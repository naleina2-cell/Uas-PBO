package skill;

public class DamageSkill
        implements Skill {

    @Override
    public void activate(){

        System.out.println(
                "Damage Skill Activated!"
        );
    }
}