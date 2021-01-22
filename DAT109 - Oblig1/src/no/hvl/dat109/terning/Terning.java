package no.hvl.dat109.terning;

/**
 * Terning klassen representerer en terning som kastes av en spiller
 * Retunerer et tall mellom 1 og 6
 *  
 * @author gruppe_44
 *
 */
public class Terning {
	
	private int sum;
	
	/**
	 * 
	 * @return sum retunerer en Integer med verdi mellom 1 og 6
	 */
	public int trill() {
		this.sum = (int)(Math.random()*5)+1;
		return sum;
	}

	
	
}
