package it.unibs.fp.medagliere;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NazioneTest {
	
	@Test
	public void testNazioneMeglioDi() throws Exception {
		final MedalCountry nazione = new MedalCountry("Italia");
		final MedalCountry altraNazione = new MedalCountry("Spagna");
		nazione.addGolds(3);;//ORO
		nazione.addSilvers(2);;//ARGENTO
		altraNazione.addGolds(2);//ORO
		altraNazione.addBronzes(1);//BRONZO
		assertTrue(nazione.getGoldsNumber()>altraNazione.getGoldsNumber());
	}
	
}
