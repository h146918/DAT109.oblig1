package no.hvl.dat109.spiller;

import no.hvl.dat109.terning.Terning;

public class Spiller {
	
	private String navn;
	private int plass;
	
	public Spiller (String navn) {
		this.navn = navn;
		this.plass = 1; 
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public int trill( ) {
		Terning terning = new Terning();
		return  terning.getSum();
	}
	
}
