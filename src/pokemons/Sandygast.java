package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Sandygast extends Pokemon {
    public Sandygast(String name, int lvl) {
        super(name, lvl);
        setStats(55, 55, 80, 70, 45, 15);
        setType(Type.GHOST, Type.GROUND);
        setMove(new Facade(), new DoubleTeam(), new Swagger());
    }
}