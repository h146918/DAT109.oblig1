package no.hvl.dat109.spiller;

import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.terning.Terning;

public class Spiller {

	private String navn;
	private Brikke brikke = new Brikke();
	private Terning terning = new Terning();

	public Spiller(String navn) {
		this.navn = navn;
	}


	public String getNavn() {
		return navn;
	}

	public Brikke getBrikke() {
		return brikke;
	}

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}

	public Terning getTerning() {
		return terning;
	}

	public void setTerning(Terning terning) {
		this.terning = terning;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}



}
