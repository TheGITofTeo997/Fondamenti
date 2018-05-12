package it.unibs.fp.tamazoo;

import it.unibs.fp.tamaadvanced.*;

public class TamaSad extends Tamagotchi{
	private String type = TamaZooStrings.TSAD;
	
	public TamaSad(double happiness, double hunger, String nick) 
	{
		super(happiness, hunger, nick);
		this.happiness = MIN;
	}
	
	
	public void setHug(int n) {
		this.happiness = MIN;
	}
	
	public void setCookie(int n) {
		double nd = n;
		this.hunger *= Math.pow(CONST, nd);
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
	
	public boolean isSad() {
		return true;
	}

	public boolean isAlive() {
		if(this.hunger <= MIN || this.hunger == MAX)
			return false;
		return true;			
	}
	
	public String getType() {
		return this.type;
	}
}
