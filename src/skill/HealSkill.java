package skill;

public class HealSkill
        implements Skill {

    @Override
    public void activate(){

        System.out.println(
                "Heal Skill Activated!"
        );
    }
}