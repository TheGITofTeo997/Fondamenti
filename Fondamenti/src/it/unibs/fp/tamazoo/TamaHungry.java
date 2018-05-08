package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaHungry extends Tamagotchi{
	
	public TamaHungry(double happiness, double hunger, String nick)
	{
		super(happiness, hunger, nick);
		this.happiness = MAX;
	}
	
	public void setHug(int n) {
		this.happiness = MAX;
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
}
