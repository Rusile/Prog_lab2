package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);

    }

    @Override
    protected String describe() {
        return "Использует DoubleEdge";
    }

    @Override
    protected void applySelfDamage(Pokemon att, double v) {
        att.setMod(Stat.HP, 1);
    }


    //Double-Edge deals damage, but the user receives 1⁄3 of the damage
    // it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent,
    // the user will lose 30 HP.
}