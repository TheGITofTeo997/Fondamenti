package it.unibs.fp.tamazoo;

import static org.junit.Assert.*;
import it.unibs.fp.tamaadvanced.*;

import org.junit.Test;

public class TamatristeTest {
	@Test
	public void tamatristeShouldDieWhenRepletionIsZero() throws Exception {
		final Tamagotchi tama = new TamaSad(0,50, "triste");
		assertFalse(!tama.isAlive());
	}
	
	@Test
	public void tamatristeIsEverUnhappyDespiteCaresses() throws Exception {
		final Tamagotchi tama = new TamaSad(0, 50, "triste");
		tama.setHug(100);
		tama.setHug(100);
		tama.setHug(100);
		tama.setHug(100);
		tama.setHug(100);
		assertFalse(!tama.isSad());
	}
}
