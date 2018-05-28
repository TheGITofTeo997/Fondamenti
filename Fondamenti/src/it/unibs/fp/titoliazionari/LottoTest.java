package it.unibs.fp.titoliazionari;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoTest {
	@Test
	public void calculateLottoValue() throws Exception {
		Titolo titolo = new Titolo("XYZ", 10.1);
		LottoPosseduto lotto = new LottoPosseduto(titolo, 15);
		lotto.updateLotValue();
		assertEquals(151.5, lotto.getLotValue(), 0.0001);
	}
}
