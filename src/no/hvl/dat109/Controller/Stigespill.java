package no.hvl.dat109.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Stigespill {

	private Terning terning;
	private List<Brikke> brikker;
//	private Brett brett;

	public Stigespill() {
		brikker = new ArrayList<Brikke>(2);
		Brikke nyBrikke = new Brikke("Bl�");
		Brikke nyBrikke1 = new Brikke("Gr�nn");
		brikker.add(nyBrikke);
		brikker.add(nyBrikke1);

		terning = new Terning();

//		brett = new Brett(100);
	}
	
	/**
	 * Spiller en runde i stigspillet
	 */

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

		// for alle spillerne, gjør trekk
	}

	private void trekk(Brikke brikke) {
		
		int antallseksere = 0;
		int verdi = terning.trill();
		
		System.out.println(brikke.getFarge() + " brikke kastet terning: " + verdi);
		brikke.flytt(verdi);
		
		System.out.println(brikke.getFarge() + " brikke LANDET PÅ RUTE: [" + brikke.getRutenr() + "]");

		while (verdi == 6) {
			antallseksere++;
			
			verdi = terning.trill();
			
			if (antallseksere == 3) {
				System.out.println(brikke.getFarge() + " brikke starter p� start igjen");

				brikke.setRutenr(1);
			
			} else {
				System.out.println(brikke.getFarge() + " Triller p� nytt");
				
				System.out.println(brikke.getFarge() + " brikke kastet terning: " + verdi);
				
				brikke.flytt(verdi);
				System.out.println(brikke.getFarge() + " brikke LANDET PÅ RUTE: [" + brikke.getRutenr() + "]");
             

			}
			

			

		}
		
		
		
		

	}

}
