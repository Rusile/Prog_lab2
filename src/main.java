import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class main {
    public static void main (String[] args){
        Battle b = new Battle();
        Palosssand pokemon1 = new Palosssand("voin_1", 65);
        Pidove pokemon2 = new Pidove("archer_1", 28);
        Sandygast pokemon3 = new Sandygast("castle_1", 90);
        Tranquill pokemon4 = new Tranquill("voin_2", 45);
        Tranquill pokemon5 = new Tranquill("archer_2", 56);
        Zekrom pokemon6 = new Zekrom("castle_2", 66);

        b.addAlly(pokemon1);
        b.addAlly(pokemon2);
        b.addAlly(pokemon3);

        b.addFoe(pokemon4);
        b.addFoe(pokemon5);
        b.addFoe(pokemon6);
        b.go();
    }
}
