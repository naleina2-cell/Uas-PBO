package exception;

public class DeadHeroException extends Exception {
    public DeadHeroException(String heroName) {
        super(heroName + " has fallen in battle.");
    }
}