package it.unibs.fp.tamaadvanced;

public class Tamagotchi {
	private double happiness;
	private double hunger;
	private String nick;
	private final int MAX = 100;
	private final int DIV = 2;
	private final int FACTOR = 5;
	private final int TRESHOLD_MIN = 30;
	private final int TRESHOLD_MAX = 80;
	public static final int MAXINPUT = 20;
	
	public Tamagotchi(double happiness, double hunger, String nick) {
		this.happiness = happiness;
		this.hunger = hunger;
		this.nick = nick;
	}
	
	public void getHunger() {
		System.out.print(TamaStrings.HUNGER);
		System.out.print(this.hunger);
		System.out.println("");
	}
	
	public void getHappiness() {
		System.out.print(TamaStrings.HAPPINESS);
		System.out.print(this.happiness);
		System.out.println("");
	}
	
	public void setCookie(int n) {
		this.hunger *= 1.10; //TO DO
		this.happiness -= FACTOR; 
		if(this.hunger>MAX)
			this.hunger = MAX;
	}
	
	public void setHug(int n) {
		this.happiness += n;
		this.hunger -= n/DIV;
		if(this.happiness>MAX)
			this.happiness = MAX;
	}
	
	public boolean isSad() {
		if(this.hunger < TRESHOLD_MIN || this.happiness < TRESHOLD_MIN) {
			return true;
		}
		return false;
	}
	public boolean isHappy() {
		if(this.hunger > TRESHOLD_MAX && this.happiness > TRESHOLD_MAX)
		{
			return true;
		}
		return false;
	}

}
