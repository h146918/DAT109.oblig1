package no.hvl.dat109.spill;

import java.util.Scanner;

import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spiller.Spiller;

public class Spill {

	private final int MAKS_SPILLER = 4;
	Brett brett = new Brett();

	public void antallSpillere() {

		for (int i = 0; i < MAKS_SPILLER; i++) {

			System.out.println("Skriv inn Spillernavn");
			Scanner scanner = new Scanner(System.in);
			String spillerNavn = scanner.nextLine();
			Brikke brikke = new Brikke();
			Spiller spiller = new Spiller(spillerNavn, brikke);
			brett.leggTilSpiller(spiller);
			scanner.close();

		}

	}

}
