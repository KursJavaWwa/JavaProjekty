package dziedziczenie;

import dziedziczenie.potwory.Potwor;

public class Pająk extends Potwor {


    Potwor p;
    Potwor p2;

    public Pająk() {
        this(40, 80);
    }

    public Pająk(double predkoscChodzenia, double zywotnosc) {
        p = new Pająk();
        p2 = new Pająk();
    }
}





