package battle;

import character.*;
import java.util.Scanner;

public class MatchManager {

    private Scanner input = new Scanner(System.in);

    public void startMatch() {

        Hero playerHero = chooseHero();

        System.out.println("\n================================");
        System.out.println("Hero chosen : " + playerHero.getName());
        System.out.println("HP           : " + playerHero.getHp());
        System.out.println("================================\n");

        playerHero.useSkill();

        BattleArena arena = new BattleArena();

        arena.demoPolymorphism();
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