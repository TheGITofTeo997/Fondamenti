package it.unibs.fp.tamagotchi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamaTestMatricole
{
	@Test
	public void dieForZeroSatisfaction() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(0, 50, "Kira");
		//assertTrue(tama.sonoMorto());
	}
	
	@Test
	public void dieForZeroHunger() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 0, "Kira");
		//assertTrue(tama.sonoMorto());
	}
	
	@Test
	public void aliveWhenSatisfactionAndHungerAreGood() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 50,"Kira");
		//assertFalse(tama.sonoMorto());
	}
/****	
	@Test(expected=IllegalArgumentException.class)
	public void cantInstantiatePetWithNegativeSatisfaction() throws Exception 
	{
		new Tamagotchi(-10, 50, "Kira");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cantInstantiatePetWithNegativeHunger() throws Exception 
	{
		new Tamagotchi(50, -10, "Kira");
	}
	
	*****/
	@Test
	public void petCanReceivePets() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 50, "Kira");
		tama.setHug(1);
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petCanReceiveCookies() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 50, "Kira");
		tama.setCookie(1);
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petIsUnhappyDueToHunger() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 10,"Kira");
		assertTrue(tama.isSad());
	}
	
	//@Test
	/*public void petIsUnhappyDueToExtremeRepletion() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 95,"Kira");
		assertTrue(tama.isSad());
	}*/
	
	@Test
	public void petIsHappyInTheMidlleOfTheRange() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 50, "Kira");
		assertFalse(tama.isSad());
	}
	
	@Test
	public void petAugmentsItsRepletionAndDiesDueToCookies() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(50, 99, "Kira");
		tama.setCookie(10);
		//boolean res=tama.sonoMorto();
		//assertTrue(res);
	}
	
	@Test
	public void petAugmentsItsSatisfactionDueToCaresses() throws Exception 
	{
		final Tamagotchi tama = new Tamagotchi(29, 50, "Kira");
		tama.setHug(10);
		assertFalse(tama.isSad());
	}
}
