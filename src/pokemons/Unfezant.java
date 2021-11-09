package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;


public class Unfezant extends Pokemon {
    public Unfezant(String name, int lvl) {
        super(name, lvl);
        setStats(80, 115, 80, 65, 55, 93);
        setType(Type.NORMAL, Type.FLYING);
        setMove(new Rest(), new Swagger(), new DoubleEdge(), new Facade());
    }
}