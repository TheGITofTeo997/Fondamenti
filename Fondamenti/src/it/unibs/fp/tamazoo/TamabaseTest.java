package it.unibs.fp.tamazoo;

import static org.junit.Assert.*;
import it.unibs.fp.tamaadvanced.*;

import org.junit.Test;

public class TamabaseTest {
	
	@Test
	public void petShouldDieWhenSatisfactionIsZero() throws Exception {
		final Tamagotchi tama = new Tamagotchi(0, 50, "Nome 1");
		assertFalse(tama.isAlive());
	}
	
	@Test
	public void petShouldDieWhenRepletionIsZero() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 0,"nome");
		assertFalse(tama.isAlive());
	}
	
	@Test
	public void petShouldLiveWhenRepletionAndSatisfactionAreInTheMiddleOfTheRange() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 50, "nome");
		assertTrue(tama.isAlive());
	}
		
	@Test
	public void petCanReceiveCaresses() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 50, "nome");
		tama.setHug(10);
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petCanReceiveCookies() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 50, "nome");
		tama.setHug(10);
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petIsUnhappyDueToHunger() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 10, "nome");
		assertTrue(tama.isSad());
	}
	
	@Test
	public void petIsUnhappyDueToExtremeRepletion() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 95, "nome");
		assertTrue(tama.isSad());
	}
	
	@Test
	public void petIsHappyInTheMidlleOfTheRange() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 50,"nome");
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petAugmentsItsRepletionAndDiesDueToCookies() throws Exception {
		final Tamagotchi tama = new Tamagotchi(50, 99, "nome");
		tama.setCookie(10);
		assertTrue(!tama.isAlive());
	}
	
	@Test
	public void petAugmentsItsSatisfactionDueToCaresses() throws Exception {
		final Tamagotchi tama = new Tamagotchi(29, 50, "nome");
		tama.setHug(10);
		assertTrue(!tama.isSad());
	}
}
