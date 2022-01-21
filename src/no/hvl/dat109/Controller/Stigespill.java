package no.hvl.dat109.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stigespill {
    
    private Terning terning;
    private List<Brikke> brikker;
    private Brett brett;

    public Stigespill() {
        brikker = new ArrayList<Brikke>(1);
        Brikke nyBrikke = new Brikke("Blå");
        brikker.add(nyBrikke);

        terning = new Terning();

        brett = new Brett(100);
    }

    public void spill() {
        boolean vunnet = false;
        while (!vunnet) {

            for (Brikke brikke : brikker) {
                trekk(brikke);

                if (brikke.getRutenr() >= 100) {
                    vunnet = true;
                    System.out.println(brikke.getFarge() + " brikke vant!");
                }

            }
        }
        

        //for alle spillerne, gjør trekk
    }

    private void trekk(Brikke brikke) {

        int verdi = terning.trill();
        System.out.println(brikke.getFarge() + " brikke kastet terning: " + verdi);

        brikke.flytt(verdi);
        System.out.println(brikke.getFarge() + " brikke LANDET PÅ RUTE: [" + brikke.getRutenr() + "]");
    
        
    }

}
