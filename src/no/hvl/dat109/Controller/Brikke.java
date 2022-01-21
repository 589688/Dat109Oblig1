package no.hvl.dat109.Controller;

public class Brikke {
    
    private Brett brett;
    private String farge;
    private int rutenr;

    public Brikke(String farge) {
        this.farge = farge;
        rutenr = 1;
        brett = new Brett(100);
    }

    public void flytt(int terningVerdi) {
        if ((rutenr+terningVerdi) <= 100) {
            rutenr += terningVerdi;

            //Sjekke om brikke landet på stige/slange
            int nyverdi = brett.spesRuteverdi(rutenr);
            if (nyverdi > 0) {
                rutenr = nyverdi;
            }
        }
    }

    public String getFarge() {
        return farge;
    }

    public int getRutenr() {
        return rutenr;
    }





}
