package no.hvl.dat109.brett;

import no.hvl.dat109.rute.Rute;

public class Brett {

	private Rute[] ruter = new Rute[101];
	
	public Brett() {
		
		for(int i = 1; i <= 100; i++) {
			
			ruter[i] = new Rute(i);
			
		}
		
	}
	
	public void skrivUtRuter() {
		
		for(int i = 1; i <= 100; i++) {
			
			System.out.println(ruter[i].getRutenr());
			
		}
		
		
	}
	
}
