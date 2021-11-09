package moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() <= (double)(1/8)) {
            return 2;
        } else {
            return 1;
        }
    }

    @Override
    protected String describe() {
        return "Использует StoneEdge";
    }
}
