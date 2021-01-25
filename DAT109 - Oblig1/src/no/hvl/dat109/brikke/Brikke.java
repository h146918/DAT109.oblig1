package no.hvl.dat109.brikke;

/**
 * Klasse som oppretter en brikke
 * 
 * @author Gruppe44
 *
 */
public class Brikke {

	private int plass;

	public Brikke() {
		this.plass = 1;
	}

	/**
	 * Metode som retunerer ny plass
	 * 
	 * @param terningKast
	 * @return int
	 */
	public int oppdaterPlass(int terningKast) {

		this.plass = plass + terningKast;
		return this.plass;

	}

	public int getPlass() {
		return plass;
	}

	public void setPlass(int plass) {
		this.plass = plass;
	}

}
