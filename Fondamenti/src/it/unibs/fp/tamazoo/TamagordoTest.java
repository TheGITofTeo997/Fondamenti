package it.unibs.fp.tamazoo;

import static org.junit.Assert.*;
import it.unibs.fp.tamaadvanced.*;
import org.junit.Test;

public class TamagordoTest {
	@Test
	public void tamagordoShouldNotDieDueToTooManyCookies() throws Exception {
		Tamagotchi tama = new TamaHungry(100, 90, "gordo");
		tama.setCookie(100);
		tama.setCookie(100);
		assertTrue(!tama.isSad());
		assertTrue(!tama.isSad());
	}

	@Test
	public void tamagordoDiesDueToHunger() throws Exception {
		Tamagotchi tama = new TamaHungry(100, 0, "gordo");
		assertTrue(!tama.isAlive());
	}
}
