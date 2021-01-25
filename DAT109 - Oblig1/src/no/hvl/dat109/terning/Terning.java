package no.hvl.dat109.terning;

/**
 * Klasse som oppretter en terning
 *  
 * @author Gruppe44
 *
 */
public class Terning {
	
	private int sum;
	
	/**
	 * Metode som triller en terning
	 * 
	 * @return sum 
	 */
	public int trill() {
		this.sum = (int)(Math.random()*5)+1;
		return sum;
	}

	
	
}
