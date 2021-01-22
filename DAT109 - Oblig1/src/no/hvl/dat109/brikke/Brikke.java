package no.hvl.dat109.brikke;

public class Brikke {
	
	private String navn;
	private int rute;
	
	
	public Brikke(String navn) {
		
		this.navn = navn;
		this.rute = 1;
		
	}

	
	public void oppdaterRute(int terning) {
		this.rute = this.rute + terning;
	}
	

	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public int getRute() {
		return rute;
	}


	public void setRute(int rute) {
		this.rute = rute;
	}
	
	
	

}
