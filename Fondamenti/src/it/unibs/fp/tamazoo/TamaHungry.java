package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaHungry extends Tamagotchi{
	/**Class which instances a TamaSad object
	 * @author Matr715329 & Matr715805
	 */
	private String type = TamaZooStrings.THUNGRY;
	
	/**
	 * Constructor method for TamaHungry Object Class
	 * 
	 * @param happiness
	 * @param hunger
	 * @param nick
	 */
	public TamaHungry(double happiness, double hunger, String nick)
	{
		super(happiness, hunger, nick);
		this.happiness = MAX;
	}
	
	/**
	 * Overriding inherited method setHug:
	 * This Tamagotchi will always be at full happiness so we are going to assign 100 every time
	 * to the happiness attribute. We will decrease hunger by the double amount of the TamaBase one.
	 * 
	 * @param number of hugs
	 */
	public void setHug(int n) {
		double nd = n;
		this.happiness = MAX;
		this.hunger -= nd;
	}
	
	/**
	 * Overriding inherited method setCookie:
	 * This method is the same as the inherited one, the only difference is that we
	 * don't modify happiness since it will always be 100.
	 * 
	 * @param number of cookies
	 */
	public void setCookie(int n) {
		double nd = n;
		this.hunger *= Math.pow(CONST, nd);
		this.happiness = MAX;
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
	
	/**
	 * Overriding inherited method isSad:
	 * This Tamagotchi will be sad only if hunger is low, so we are only going to check that.
	 * 
	 * @return true;
	 */
	public boolean isSad() {
		if(this.hunger < TRESHOLD_MIN) {
			return true;
		}
		return false;
	}
	
	/**
	 * Overriding inherited method isAlive:
	 * This Tamagotchi will die only if hunger is low, so we are only going to check that.
	 * 
	 */
	public boolean isAlive() {
		if(this.hunger <= MIN)
			return false;
		return true;			
	}
	
	/**
	 * This method will return the type of Tamagotchi in a String.
	 */
	public String getType() {
		return this.type;
	}
}
