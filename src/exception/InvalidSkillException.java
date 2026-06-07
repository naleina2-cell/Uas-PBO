package exception;

public class InvalidSkillException extends Exception {
    public InvalidSkillException() {
        super("Skill cannot be cast.");
    }
}
