package no.hvl.dat109.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;

public class JUnitTest {

	Brikke brikke = new Brikke();
	Brett brett = new Brett();
	
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
		brikke.setPlass(nyPlass);
		assertEquals(nyPlass, brikke.getPlass());
	}
	
	@Test
	public final void nyListeErTom() {
		
	}
	
	
}
