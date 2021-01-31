package no.hvl.dat109.brett;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.terning.Terning;

/**
 * Klasse som oppretter et brett
 * 
 * @author Gruppe44
 *
 */
public class Brett {

	private Terning terning = new Terning();
	private List<Spiller> spillere = new ArrayList<Spiller>();

	/**
	 * Metode som legger til en spiller
	 * 
	 * @param spiller
	 */
	public void leggTilSpiller(Spiller spiller) {

		spillere.add(spiller);
	}

	/**
	 * Metode som spiller en runde for alle spillere og gir tilbakemelding om ny plass, fortsetter til en spiller har vunnet 
	 * 
	 * @throws InterruptedException
	 */
	public void runde() throws InterruptedException {
		boolean vunnet = false;
		int runde = 1;
		System.out.println();
		System.out.println("Bruk vedlagt bilde av terningspill for best spillopplevelse");
		System.out.println();
		while (!vunnet) {
			
			for (Spiller s : spillere) {

				int terningKast = terning.trill();
				System.out.println("Runde " + runde);
				System.out.println(s.getNavn() + " står på plass " + s.getBrikke().getPlass());
				System.out.println("Triller terningen og får " + terningKast);
				switch (s.getBrikke().oppdaterPlass(terningKast)) {

				// slange = 37 -> 20, 70->32, 99 -> 64
				// stige = 27 -> 46, -> 42 -> 62, 66 ->88

				case 37:
					System.out.println("Flytter til plass 37, men der var det en slange og " + s.getNavn() + " sklir ned til plass 20 ");
					s.getBrikke().setPlass(20);
					break;
				case 70:
					System.out.println("Flytter til plass 70, men der var det en slange og " + s.getNavn() + " sklir ned til plass 32 ");
					s.getBrikke().setPlass(32);
					break;
				case 99:
					System.out.println("Flytter til plass 99, men der var det en slange og " + s.getNavn() + " sklir ned til plass 64 ");
					s.getBrikke().setPlass(64);
					break;
				case 27:
					System.out.println("Flytter til plass 27, men der var det en stige og " + s.getNavn() + " klatrer opp til plass 46 ");
					s.getBrikke().setPlass(46);
					break;
				case 42:
					System.out.println("Flytter til plass 42, men der var det en stige og " + s.getNavn() + " klatrer opp til plass 62 ");
					s.getBrikke().setPlass(62);
					break;
				case 66:
					System.out.println("Flytter til plass 66, men der var det en stige og " + s.getNavn() + " klatrer opp til plass 88 ");
					s.getBrikke().setPlass(88);
					break;
				default:
					if (s.getBrikke().getPlass() == 100) {
						System.out.println("****** " + s.getNavn() + " har vunnet spillet ******");
						vunnet = true;
						return;

					}else if (s.getBrikke().getPlass() > 100) {
						s.getBrikke().setPlass(s.getBrikke().getPlass() - terningKast);
						System.out.println( "Siden du må lande nøyaktig på plass 100 for å vinne, så flytter ikke du plass denne runden");
					} else {
					System.out.println("Flytter til plass " + s.getBrikke().getPlass());
					}

				}
				

				System.out.println();
				Thread.sleep(5000);
				
			}
			runde++;
		}

	}

}
