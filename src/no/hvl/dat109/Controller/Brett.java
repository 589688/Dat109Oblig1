package no.hvl.dat109.Controller;

import java.util.HashMap;
import java.util.Map;

public class Brett {

    //Brettet eier terningen
    private Map<Rute, Rute> brett;

    public Brett(int antallRuter) {
       brett = new HashMap<Rute, Rute>();

       setup();
    }

    //Iterasjon 2: Stiger og slanger
    private void setup() {
        brett.put(new Rute(5), new Rute(13));
        brett.put(new Rute(15), new Rute(8));
        brett.put(new Rute(99), new Rute(1));
    }

    public int spesRuteverdi(int rutenr) {
        Rute nyrute = brett.get(new Rute(rutenr));

        int nyrutenr = 0;
        if (nyrute != null)
            nyrutenr = nyrute.getPos();

        return nyrutenr;
    }
}
