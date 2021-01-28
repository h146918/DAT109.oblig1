package no.hvl.dat109.spiller;

import no.hvl.dat109.brikke.Brikke;

/**
 * Klasse som oppretter en spiller
 * 
 * @author Gruppe44
 *
 */
public class Spiller {

	private String navn;
	private Brikke brikke;

	public Spiller(String navn, Brikke brikke) {
		this.navn = navn;
		this.brikke = brikke;
	}

	public String getNavn() {
		return navn;
	}

//	public void setNavn(String navn) {
//		this.navn = navn;
//	}

	public Brikke getBrikke() {
		return brikke;
	}

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}


}
