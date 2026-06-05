package skill;

public class DamageSkill extends Skill {

    public DamageSkill(String skillName, int power) {
        super(skillName, power);
    }

    @Override
    public void useSkill() {
        System.out.println(skillName + " memberikan damage sebesar " + power);
    }
}