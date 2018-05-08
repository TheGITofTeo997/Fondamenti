package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaSad extends Tamagotchi{
	
	public TamaSad(double happiness, double hunger, String nick) 
	{
		super(happiness, hunger, nick);
		this.happiness = MIN;
	}
	
	
	public void setHug() {
		
	}
	
	public void setCookie() {
		
	}
	
	public boolean isSad() {
		return true;
	}

	public boolean isAlive() {
		if(this.hunger <= MIN || this.hunger == MAX)
			return false;
		return true;			
	}
}
