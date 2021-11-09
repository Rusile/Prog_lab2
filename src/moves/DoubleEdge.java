package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove{
    public DoubleEdge(){
        super(Type.NORMAL, 120, 100);

    }
    protected void applySelfDamage(Pokemon att, double v){
        this. = v * (1/3);
    }


    //Double-Edge deals damage, but the user receives 1⁄3 of the damage
    // it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent,
    // the user will lose 30 HP.
}