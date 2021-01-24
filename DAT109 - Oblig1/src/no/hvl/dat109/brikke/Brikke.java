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


	public int getRute() {
		return plass;
	}

	public void setRute(int plass) {
		this.plass = plass;
	}

}
