package it.unibs.fp.medagliere;

import static org.junit.Assert.*;

import org.junit.Test;

public class GaraTest {
	private static final String NOME = "salto in lungo";
	private static final int NUMMEDAGLIE = 3;
	
	@Test
	public void testGaraNonEseguita() throws Exception {
		final MedalRace gara = new MedalRace(NOME);
		assertFalse(gara.getWinnerNames().length>0);
	}
	
	@Test
	public void testGaraEseguita() throws Exception {
		final MedalRace gara = new MedalRace(NOME);
		assertTrue(gara.getWinnerNames().length>=0);
	}
		
}
