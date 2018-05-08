package it.unibs.fp.tamaadvanced;

public class Tamagotchi{
	/**Class which instances a Tamagotchi object
	 * @author Matr715329 & Matr715805
	 */
	protected double happiness;
	protected double hunger;
	protected String nick;
	protected final double MAX = 100;
	protected final double MIN = 0;
	protected final int TRESHOLD_MIN = 30;
	protected final int TRESHOLD_MAX = 80;
	private final int DIV = 2;
	private final int FACTOR = 4;
	private final double CONST = 1.10;
	public static final int MAXINPUT = 20;
	
	/**
	 * Constructor method for Tamagotchi Object Class
	 * 
	 * @param happiness
	 * @param hunger
	 * @param nick
	 */
	public Tamagotchi(double happiness, double hunger, String nick) {
		this.happiness = happiness;
		this.hunger = hunger;
		this.nick = nick;
	}
	
	/**
	 * Method which return hunger value
	 * 
	 * @return hunger value
	 */
	public double getHunger() {
		return this.hunger;
	}
	/**
	 * Method which return happiness value
	 * 
	 * @return happiness value
	 */
	
	public double getHappiness() {
		return this.happiness;
	}
	
	/**
	 * Method which set hunger and happiness value accordingly to the number of cookies
	 * 
	 * @param number of cookies
	 */
	public void setCookie(int n) {
		double nd = n;
		this.hunger *= Math.pow(CONST, nd);
		this.happiness -= nd/FACTOR;
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
	
	/**
	 * Method which set hunger and happiness value accordingly to the number of hugs
	 * 
	 * @param number of hugs
	 */
	public void setHug(int n) {
		double nd = n;
		this.happiness += nd;
		this.hunger -= nd/DIV;
		if(this.happiness>MAX)
			this.happiness = MAX;
	}
	
	/**
	 * Method that returns sad value
	 * 
	 * @return if Tama is sad or not
	 */
	public boolean isSad() {
		if(this.hunger < TRESHOLD_MIN || this.happiness < TRESHOLD_MIN || this.hunger > TRESHOLD_MAX) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method that returns life status of Tama
	 * 
	 * @return if Tama is dead or not
	 */
	public boolean isAlive() {
		if(this.hunger <= MIN || this.happiness <= MIN)
			return false;
		if(this.hunger == MAX)
			return false;
		return true;			
	}

}
