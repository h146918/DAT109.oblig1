package no.hvl.dat109.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.terning.Terning;

public class JUnitTest {

	Brikke brikke = new Brikke();
	Brett brett = new Brett();
	Terning terning = new Terning();
	
	Spiller testSpiller = new Spiller("Test Person", brikke);
	
	/**
	 * Test om brikke har riktig start posisjon
	 */
	@Test
	public final void riktigStartPlass() {
		assertEquals(1, brikke.getPlass());
	}
	
	/**
	 * Test om brikke oppdaterer seg riktig
	 */
	@Test
	public final void oppdaterPlass() {
		int nyPlass = 5;
		brikke.oppdaterPlass(nyPlass);
		assertEquals(nyPlass+1, brikke.getPlass());
	}
	

	/**
	 * Test om terningen triller verdier mellom 1 og 6
	 */
	@Test
	public final void terningVerdi() {
		
		int verdi = 0;
		
		for(int i = 0; i < 20; i++) {
			verdi = verdi + terning.trill();
		}
		
		assertTrue(verdi/20 >= 1 && verdi/20 <= 6 );
		
	}
	
	
	
}
