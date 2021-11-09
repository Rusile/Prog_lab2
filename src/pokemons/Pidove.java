package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Pidove extends Pokemon {
    public Pidove(String name, int lvl) {
        super(name, lvl);
        setStats(50, 55, 50, 36, 30, 43);
        setType(Type.NORMAL, Type.FLYING);
        setMove(new Rest(), new Swagger());
    }
}