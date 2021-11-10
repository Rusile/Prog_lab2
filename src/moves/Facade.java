package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status s = pokemon.getCondition();
        if (s == Status.BURN || s == Status.PARALYZE || s == Status.POISON)
            pokemon.setMod(Stat.ATTACK, (int) Math.round(damage * 2));
        else {
            super.applyOppDamage(pokemon, damage);
        }
    }

    @Override
    protected String describe() {
        return "применяет Facade";
    }
}