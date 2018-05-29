package it.unibs.fp.medagliere;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElencoGareTest {
	@Test
	public void testAggiuntaGara() throws Exception {
		final RaceList gare = new RaceList();
		gare.addRace("Lancio del peso");
		gare.addRace("100MT piani");
		assertEquals(2, gare.getRaceNumber());
	}
	
	@Test
	public void testRicercaGaraPresente() throws Exception {
		final RaceList gare = new RaceList();
		gare.addRace("Lancio del peso");
		gare.addRace("100MT piani");
		assertTrue(gare.checkIfRaceExists("Lancio del peso"));
	}
	
	@Test
	public void testRicercaGaraNonPresente() throws Exception {
		final RaceList gare = new RaceList();
		gare.addRace("Lancio del peso");
		gare.addRace("100MT piani");
		assertFalse(gare.checkIfRaceExists("Lancio del martello"));
	}
}
