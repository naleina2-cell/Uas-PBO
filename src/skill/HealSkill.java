package skill;

public class HealSkill extends Skill {

    public HealSkill(String skillName, int power) {
        super(skillName, power);
    }

    @Override
    public void useSkill() {
        System.out.println(skillName + " memulihkan HP sebesar " + power);
    }
}