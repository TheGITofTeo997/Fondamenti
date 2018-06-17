package it.unibs.fp.labtestsimulation;
import java.util.*;

public class IngredientList {
	private ArrayList<Ingredient> ingredientList = new ArrayList<>();
	
	public void addToList(Ingredient i) {
		ingredientList.add(i);
	}
	
	//Getters
	
	public int getSize() {
		return ingredientList.size();
	}
	
	public String[] getAllIngredientsNames() {
		String[] toReturn = new String[ingredientList.size()];
		for(int i=0; i<ingredientList.size(); i++) {
			toReturn[i] = ingredientList.get(i).getName();
		}
		return toReturn;
	}
	
	public Ingredient getIngredientAt(int index) {
		return ingredientList.get(index);
	}
	
	public int[] getAllIngredientsCals() {
		int[] toReturn = new int[ingredientList.size()];
		for(int i=0; i<ingredientList.size(); i++)
		{
			toReturn[i] = ingredientList.get(i).getCal();
		}
		return toReturn;
	}
}
