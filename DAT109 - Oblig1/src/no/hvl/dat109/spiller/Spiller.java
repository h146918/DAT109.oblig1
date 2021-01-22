package no.hvl.dat109.spiller;

import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.terning.Terning;

public class Spiller {
	
	private String navn;
	private int plass;
	private int terningKast;
	
	public Spiller (String navn) {
		this.navn = navn;
		this.plass = 1; 
		this.terningKast = 0;
		
		Brikke brikke = new Brikke(navn);
		
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public int trill() {
		Terning terning = new Terning();
		this.terningKast = terning.getSum();
		return this.terningKast;
	}
	
	public void flytt() {
		
		
		
	}
	
}
