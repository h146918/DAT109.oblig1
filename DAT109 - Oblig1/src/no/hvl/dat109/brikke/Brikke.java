package no.hvl.dat109.brikke;

public class Brikke {

	@Override
	public String toString() {
		return "Brikke [plass=" + plass + "]";
	}

	private int plass;

	public Brikke() {
		this.plass = 1;
	}

	public int getPlass() {
		return plass;
	}

	public void setPlass(int plass) {
		this.plass = plass;
	}

	public int oppdaterPlass(int terningKast) {

		this.plass = plass + terningKast;
		return this.plass;

	}

}
