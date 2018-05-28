package it.unibs.fp.titoliazionari;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitoloTest {
	
	@Test
	public void stringRepresentationShouldChangeAsEffectOfValueChanges() throws Exception {
		Titolo titolo = new Titolo("Donald Duck, INC.", 100);
		ElencoTitoli list = new ElencoTitoli();
		list.addTitle(titolo);
		TitoloUtils.dailyVariation(list);
		assertNotEquals(0,titolo.getValue());
	}

}
