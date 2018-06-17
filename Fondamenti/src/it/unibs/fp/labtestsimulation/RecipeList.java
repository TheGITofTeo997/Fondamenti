package it.unibs.fp.labtestsimulation;

import java.util.ArrayList;

public class RecipeList {
	private ArrayList<Recipe> recipeList = new ArrayList<>();
		
	public void addToList(Recipe i) {
		recipeList.add(i);
	}
	
	//Getters
	
	public int getSize() {
		return recipeList.size();
	}
	
	public Recipe getRecipeAt(int index) {
		return recipeList.get(index);
	}
	
	public String[] getAllRecipeNames() {
		String[] toReturn = new String[recipeList.size()];
		for(int i=0; i<recipeList.size(); i++) {
			toReturn[i] = recipeList.get(i).getName();
		}
		return toReturn;
	}
	
	public int[] getAllRecipeCals() {
		int[] toReturn = new int[recipeList.size()];
		for(int i=0; i<recipeList.size(); i++)
		{
			toReturn[i] = recipeList.get(i).getTotalCals();
		}
		return toReturn;
	}
}
