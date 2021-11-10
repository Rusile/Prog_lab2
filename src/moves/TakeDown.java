package moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected String describe() {
        return "Использует TakeDown";
    }

    @Override
    protected void applySelfDamage(Pokemon att, double v) {
        att.setMod(Stat.HP, 1);
    }
    /*
    Take Down deals damage, but the user receives 1⁄4 of the damage it inflicted in recoil.
    In other words, if the attack does 100 HP damage to the opponent, the user will lose 25 HP.
     */
}