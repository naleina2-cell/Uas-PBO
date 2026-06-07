package battle;
import main.GameState;
import character.*;
import java.util.Scanner;

private Team teamA = new Team("Team A");
private Team teamB = new Team("Team B");

public class MatchManager {

    private Scanner input = new Scanner(System.in);
    private GameState state;
    private Hero playerHero;

    public void startMatch() {
        // 1. LOBBY
        state = GameState.LOBBY;
        System.out.println("=== LOBBY ===");
        // hero picking
        state = GameState.DRAFT;
        for (int i = 1; i <= 6; i++) {

    System.out.println("\nPLAYER " + i + " PICK HERO");

    Hero hero = chooseHero();

    if (i <= 3) {
        teamA.addHero(hero);
    } else {
        teamB.addHero(hero);
    }
}

        System.out.println("\nHero chosen : " + playerHero.getName());
        // start battle
        startBattle();
    
    }
    private void startBattle() {

    state = GameState.IN_GAME;

    System.out.println("\n=== BATTLE STARTED ===");

    new Thread(() -> {

        int timer = 0;

        while (state == GameState.IN_GAME) {


            timer++;
            

            // simulasi battle
            System.out.println("Battle running... time: " + timer);

            // regen tiap 30 detik (simulasi)
            if (timer % 30 == 0) {
                System.out.println("Hero regen +15 HP");
            }

            // creep spawn every 10 seconds (simulasi)
            if (timer % 10 == 0) {
                System.out.println("Creep spawned");
            }

            // WIN CONDITION CONTOH (dummy)
            if (timer == 120) {
                state = GameState.FINISHED;
                System.out.println("GAME FINISHED!");
            if (timer % 5 == 0) {

    towerA.takeDamage(50);
    towerB.takeDamage(50);

    System.out.println("Tower A HP : " + towerA.getHp());
    System.out.println("Tower B HP : " + towerB.getHp());
}
8. Win Condition: jika salah satu tower hancur, game selesai
            if (towerA.isDestroyed()) {
                state = GameState.FINISHED;
                System.out.println("Team B wins!");
            }
            if (towerB.isDestroyed()) {
                state = GameState.FINISHED;
                System.out.println("Team A wins!");
            }
            }

            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
            break;
        }

    }).start();
}

    private Hero chooseHero() {

        System.out.println("===== CHOOSE HERO =====");

        System.out.println("\nASSASSIN");
        System.out.println("1. Minato");
        System.out.println("2. Kakashi");
        System.out.println("3. Eren");

        System.out.println("\nMAGE");
        System.out.println("4. Hinata");
        System.out.println("5. Unohana");
        System.out.println("6. Vanessa");

        System.out.println("\nTANK");
        System.out.println("7. Sakura");
        System.out.println("8. Orihime");
        System.out.println("9. Chad");

        System.out.print("\nPilihan: ");

        int choice = input.nextInt();

        switch(choice) {

            case 1:
                return new Assassin("Minato");

            case 2:
                return new Assassin("Kakashi");

            case 3:
                return new Assassin("Eren");

            case 4:
                return new Mage("Hinata");

            case 5:
                return new Mage("Unohana");

            case 6:
                return new Mage("Vanessa");

            case 7:
                return new Tank("Sakura");

            case 8:
                return new Tank("Orihime");

            case 9:
                return new Tank("Chad");

            default:
                System.out.println("Invalid choice!");
                return new Assassin("Minato");
        }
    }
}