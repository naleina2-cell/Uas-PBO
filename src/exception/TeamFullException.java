package exception;

public class TeamFullException extends Exception {
    public TeamFullException() {
        super("Your party is already full.");
    }
}