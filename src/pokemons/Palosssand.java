package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Palosssand extends Pokemon {
    public Palosssand(String name, int lvl) {
        super(name, lvl);
        setStats(85, 75, 110, 100, 75, 35);
        setType(Type.GHOST, Type.GROUND);
        setMove(new Facade(), new DoubleTeam(), new Swagger(), new TakeDown());
    }
}