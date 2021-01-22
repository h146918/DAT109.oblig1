package no.hvl.dat109.spiller;

import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.terning.Terning;

public class Spiller {
	
	private String navn;
	private Brikke brikke;
	
	public Spiller (String navn) {
		this.navn = navn;
		this.brikke = new Brikke(navn);
		
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public int trill() {
		Terning terning = new Terning();
		this.brikke.oppdaterRute(terning.getSum()); 
		return terning.getSum();
	}
	
	public void flytt() {
		
		System.out.println(this.getNavn() + " har flyttet brikken sin til plass " + this.brikke.getRute());
		
		
	}
	
}
