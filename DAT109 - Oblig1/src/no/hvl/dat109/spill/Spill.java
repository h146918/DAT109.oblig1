package no.hvl.dat109.spill;

import java.util.Scanner;

import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spiller.Spiller;

public class Spill {

	private final int MAKS_SPILLER = 2;
	Brett brett = new Brett();

	public void antallSpillere() {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < MAKS_SPILLER; i++) {

			System.out.println("Skriv inn Spillernavn");
			
			String spillerNavn = scanner.nextLine();
			Brikke brikke = new Brikke();
			Spiller spiller = new Spiller(spillerNavn, brikke);
			brett.leggTilSpiller(spiller);
			

		}
		
		scanner.close();
	}

	public Brett getBrett() {
		return brett;
	}

	public void setBrett(Brett brett) {
		this.brett = brett;
	}
	
	

}
