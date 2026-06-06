package exception;

public class DeadHeroException extends Exception {
    public DeadHeroException() {
        super("Hero has fallen in battle.");
    }
}