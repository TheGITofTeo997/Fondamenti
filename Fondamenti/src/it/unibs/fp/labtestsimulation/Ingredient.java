package it.unibs.fp.labtestsimulation;

public class Ingredient {
	private String name;
	private int cal;
	
	public Ingredient(String name, int cal){
		this.name = name;
		this.cal = cal;
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	
	public int getCal() {
		return this.cal;
	}
	
}
