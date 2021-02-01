package no.hvl.dat109.spill;

import java.util.Scanner;
import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spiller.Spiller;

/**
 * Klasse som oppretter et spill
 * 
 * @author Gruppe44
 *
 */
public class Spill {

	private final int MAKS_SPILLER = 4;
	private Brett brett = new Brett();

	
	/**
	 * Metode som starter et spill
	 * @throws InterruptedException
	 */
	public void startSpill() throws InterruptedException {

		antallSpillere();

		brett.runde();

	}
	
	
	
	/**
	 * Metode som tar inn antall spillere og navn fra console
	 */
	public void antallSpillere() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn antall spillere");
		int onskedeSpillere = scanner.nextInt();

		if (onskedeSpillere <= MAKS_SPILLER) {

			for (int i = 0; i < onskedeSpillere; i++) {

				System.out.println("Skriv inn Spillernavn");

				String spillerNavn = scanner.next();
				Brikke brikke = new Brikke();
				Spiller spiller = new Spiller(spillerNavn, brikke);
				brett.leggTilSpiller(spiller);

			}

			scanner.close();
		}
	}

	



}
