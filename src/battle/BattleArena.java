package battle;

import character.Assassin;
import character.Mage;
import character.Tank;
import character.Hero;

public class BattleArena {

    public void demoPolymorphism() {

        Hero hero;

        hero = new Assassin("Minato");
        hero.useSkill();

        hero = new Mage("Hinata");
        hero.useSkill();

        hero = new Tank("Chad");
        hero.useSkill();
    }
}