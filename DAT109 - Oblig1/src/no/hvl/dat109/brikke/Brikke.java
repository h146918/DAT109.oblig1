package no.hvl.dat109.brikke;

import no.hvl.dat109.rute.Rute;

public class Brikke {

	private String navn;
	private Rute rute;

	public Brikke(String navn) {

		this.navn = navn;

	}

	public void oppdaterRute(int terning) {

		switch (rute.getRutenr()) {
		case 37:
			rute.setRutenr(20);
			break;
		case 70:
			rute.setRutenr(32);
			break;
		case 99:
			rute.setRutenr(64);
			break;
		case 27:
			rute.setRutenr(46);
			break;
		case 42:
			rute.setRutenr(62);
			break;
		case 66:
			rute.setRutenr(88);
			break;
		default:
			rute.setRutenr(rute.getRutenr() + terning);
		}

	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Rute getRute() {
		return rute;
	}

	public void setRute(Rute rute) {
		this.rute = rute;
	}

}
