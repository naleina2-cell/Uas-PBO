package skill;

public class Skill {

    protected String skillName;
    protected int power;

    public Skill(String skillName, int power) {
        this.skillName = skillName;
        this.power = power;
    }

    public void useSkill() {
        System.out.println(skillName + " digunakan.");
    }

    public String getSkillName() {
        return skillName;
    }

    public int getPower() {
        return power;
    }
}