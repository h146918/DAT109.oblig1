package no.hvl.dat109.spiller;

import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.terning.Terning;

public class Spiller {

	private String navn;
	private Brikke brikke;
	private Terning terning;

	public Spiller(String navn) {
		this.navn = navn;
		this.brikke = new Brikke(navn);
		this.terning = new Terning();

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

	public void trill() {
		int terningkast = terning.trill();
		this.brikke.oppdaterRute(terningkast);
		System.out.print(this.getNavn() + " fikk terningkast " + terningkast);
	}

	public void flytt() {

		System.out.print(" og har flyttet brikken sin til plass " + this.brikke.getRute() + "!");
		System.out.println();

	}

}
