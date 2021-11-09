package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;


public class Tranquill extends Pokemon {
    public Tranquill(String name, int lvl) {
        super(name, lvl);
        setStats(62, 77, 62, 50, 42, 65);
        setType(Type.NORMAL, Type.FLYING);
        setMove(new Rest(), new Swagger(), new DoubleEdge());
    }
}