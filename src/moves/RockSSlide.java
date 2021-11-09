package moves;

import ru.ifmo.se.pokemon.*;

public class RockSSlide extends PhysicalMove {

    public RockSSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe() {
        return "Использует RockSlide";
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.3) {
            Effect.flinch(defender);
        }
    }


}