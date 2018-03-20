package it.unibs.fp.tamagotchi;

public class Tamagotchi {
	private double happiness;
	private double hunger;
	private String nick;
	private int max = 100;
	
	public Tamagotchi(double happiness, double hunger, String nick) {
		this.happiness = happiness;
		this.hunger = hunger;
		this.nick = nick;
	}
	
	public void getHunger() {
		System.out.println(TamaStrings.HUNGER);
		System.out.print(this.hunger);
	}
	
	public void getHappiness() {
		System.out.println(TamaStrings.HAPPINESS);
		System.out.print(this.happiness);
	}
	

}
