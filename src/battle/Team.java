package battle;
import java.util.ArrayList;
import java.util.List;
import character.Hero;

public class Team {
    private String name;
    private List<Hero> heroes = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

}
