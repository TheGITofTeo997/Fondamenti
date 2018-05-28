package it.unibs.fp.titoliazionari;

import static org.junit.Assert.*;

import org.junit.Test;

public class PortafoglioTest {
	@Test
	public void createPortafoglioWithASetOfLottoAndCalculateTheValue() throws Exception {
		ElencoTitoli titoli = new ElencoTitoli();
		Portafoglio p = new Portafoglio("test");
		p.addLot(createLotto("XYZ", 10.0, 40));
		p.addLot(createLotto("ABC", 20.0, 30));
		p.addLot(createLotto("CBA", 30.0, 20));
		p.addLot(createLotto("ZYX", 40.0, 10));
		assertEquals(2000.0, p.getWalletValue(), 0.0001);
	}
	
	private LottoPosseduto createLotto(String name, double initialValue, int amount) {
		return new LottoPosseduto(new Titolo(name, initialValue), amount);
	}
}
