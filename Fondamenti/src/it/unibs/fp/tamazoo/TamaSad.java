package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaSad extends Tamagotchi{
	/**Class which instances a TamaSad object
	 * @author Matr715329 & Matr715805
	 */
	private String type = TamaZooStrings.TSAD;
	
	/**
	 * Constructor method for TamaSad Object Class
	 * 
	 * @param happiness
	 * @param hunger
	 * @param nick
	 */
	public TamaSad(double happiness, double hunger, String nick) 
	{
		super(happiness, hunger, nick);
		this.happiness = MIN;
	}
	
	/**
	 * Overriding inherited method setHug:
	 * This Tamagotchi will always be sad so we are going to assign 0 every time
	 * to the happiness attribute.
	 * 
	 * @param number of hugs
	 */
	public void setHug(int n) {
		this.happiness = MIN;
	}
	
	/**
	 * Overriding inherited method setCookie:
	 * This method is the same as the inherited one, the only difference is that we
	 * don't modify happiness since it will always be 0.
	 * 
	 * @param number of cookies
	 */
	public void setCookie(int n) {
		double nd = n;
		this.hunger *= Math.pow(CONST, nd);
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
	
	/**
	 * Overriding inherited method isSad:
	 * We are always going to return true since this Tamagotchi will always be sad.
	 * 
	 * @return true;
	 */
	
	public boolean isSad() {
		return true;
	}
	
	/**
	 * Overriding inherited method isAlive:
	 * Same as the inherited method, the only difference is that this Tamagotchi
	 * won't die for 0 happiness (since it will always be 0).
	 * 
	 */
	public boolean isAlive() {
		if(this.hunger <= MIN || this.hunger == MAX)
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
