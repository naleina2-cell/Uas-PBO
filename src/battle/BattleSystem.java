packge battle;

import character.*;
import thread.RespawnThread;

public class BattleSystem {
    public static void heroAttackHero(
        Hero attacker,
        Hero target
    ){
        target.takeDamage(
            attacker.getAttack()

        );
        System.out.println(
            attacker.getName()
            + "attacks"
            + target.getName()
        );
        System.out.println(
            target.getName()
            + "HP"
            + target.getHp()
        );
        if (target.isDead()){
            System.out.println(
                target.getName()
                + "has been killed!"
            );
            new RespawnThread(target).start();

        }
    }
    public static void heroAttackCreep(
        Hero hero,
        Creep creep
    ){
        creep.takeDamage(
            hero.getAttack()
        );
        System.out.println(
            hero.getName()
            + " attacks "
            + creep.getName()
        );
        System.out.println(
            creep.getName()
            + " HP:"
            + creep.getHp()
        );
        
    }
}
