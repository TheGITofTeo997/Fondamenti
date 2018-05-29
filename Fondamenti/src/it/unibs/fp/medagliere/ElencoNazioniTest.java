package it.unibs.fp.medagliere;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElencoNazioniTest {
	@Test
	public void testAggiuntaNazione() throws Exception {
		final CountryList nazioni = new CountryList();
		nazioni.addCountry("Italia");
		nazioni.addCountry("Spagna");
		nazioni.addCountry("Giappone");
		assertEquals(3, nazioni.getCountryNumber());
	}
	
	@Test
	public void testRicercaNazionePresente() throws Exception {
		final CountryList nazioni = new CountryList();
		nazioni.addCountry("Italia");
		nazioni.addCountry("Spagna");
		nazioni.addCountry("Giappone");
		assertTrue(nazioni.checkIfCountryExists("Spagna"));
	}
	
	@Test
	public void testRicercaNazioneNonPresente() throws Exception {
		final CountryList nazioni = new CountryList();
		nazioni.addCountry("Italia");
		nazioni.addCountry("Spagna");
		nazioni.addCountry("Giappone");
		assertFalse(nazioni.checkIfCountryExists("Olanda"));
	}
}
