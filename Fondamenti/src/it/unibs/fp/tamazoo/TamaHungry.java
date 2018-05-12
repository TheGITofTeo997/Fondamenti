package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaHungry extends Tamagotchi{
	private String type = TamaZooStrings.THUNGRY;
	
	public TamaHungry(double happiness, double hunger, String nick)
	{
		super(happiness, hunger, nick);
		this.happiness = MAX;
	}
	
	public void setHug(int n) {
		double nd = n;
		this.happiness = MAX;
		this.hunger -= nd;
	}
	
	public void setCookie(int n) {
		double nd = n;
		this.hunger *= Math.pow(CONST, nd);
		this.happiness = MAX;
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
		
	public boolean isSad() {
		if(this.hunger < TRESHOLD_MIN) {
			return true;
		}
		return false;
	}
	
	public boolean isAlive() {
		if(this.hunger <= MIN)
			return false;
		return true;			
	}
	
	public String getType() {
		return this.type;
	}
}
