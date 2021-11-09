package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;


public class Zekrom extends Pokemon {
    public Zekrom(String name, int lvl) {
        super(name, lvl);
        setStats(100, 150, 120, 120, 100, 90);
        setType(Type.DRAGON, Type.ELECTRIC);
        setMove(new Facade(), new RockSSlide(), new StoneEdge(), new Rest());
    }
}