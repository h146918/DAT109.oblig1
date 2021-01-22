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
	 * Oppretter en terning med en tilfeldig verdi mellom 1 og 6 
	 */
	public Terning () {
		this.sum = (int)(Math.random()*5)+1;
	}

	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
	
	
}
