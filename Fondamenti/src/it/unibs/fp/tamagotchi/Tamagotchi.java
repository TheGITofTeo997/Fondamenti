package it.unibs.fp.tamagotchi;

public class Tamagotchi {
	private double happiness;
	private double hunger;
	private String nick;
	private final int MAX = 100;
	private final int FACTOR = 5;
	private final int TRESHOLD_MIN = 30;
	private final int TRESHOLD_MAX = 80;
	public boolean status;
	
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
		this.hunger += n;
		this.happiness -= FACTOR; 
	}
	
	public void setHug(int n) {
		this.happiness += n;
		this.hunger -= FACTOR;
	}
	
	public void checkStatus() {
		if(this.hunger < TRESHOLD_MIN || this.happiness < TRESHOLD_MIN) {
			setSad();
		}
		else if(this.hunger > TRESHOLD_MAX && this.happiness > TRESHOLD_MAX)
		{
			setHappy();
		}
	}
	
	public void setSad() {
		this.status = false;
	}
	
	public void setHappy() {
		this.status = true;	
	}

}
