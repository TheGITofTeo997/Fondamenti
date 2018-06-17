package it.unibs.fp.labtestsimulation;

import java.util.*;

public class Recipe {
	private ArrayList<Ingredient> recipeIngredients = new ArrayList<>();
	private String recipeName;
	private String recipeDesc;
	private int totalCals=0;
	private int dish;
	
	
	public Recipe(String recipeName, String recipeDesc, int dish) {
		this.recipeName = recipeName;
		this.recipeDesc = recipeDesc;
		this.dish = dish;
	}
	
	public void addIngredient(Ingredient i) {
		recipeIngredients.add(i);
	}
	
	private void calcTotalCals () {
		for(int i=0; i<recipeIngredients.size(); i++) {
			this.totalCals += recipeIngredients.get(i).getCal();
		}
	}
	
	//Getters
	public int getTotalCals() {
		totalCals=0;
		calcTotalCals();
		return this.totalCals;
	}

	public String getName() {
		return this.recipeName;
	}
	
	public String getDesc() {
		return this.recipeDesc;
	}
	
	public int getDish() {
		return this.dish;
	}
	
	
}
