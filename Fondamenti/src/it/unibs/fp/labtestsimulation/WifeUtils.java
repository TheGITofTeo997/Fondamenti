package it.unibs.fp.labtestsimulation;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class WifeUtils {
	
	public static void addIngredientToList(IngredientList iList) {
		String nameIn = InputDati.leggiStringaNonVuota(WifeStrings.NAMEINGR);
		int cal = InputDati.leggiInteroNonNegativo(WifeStrings.CALINGR);
		iList.addToList(new Ingredient(nameIn, cal));
	}
	
	public static void displayIngredientsFromList(IngredientList iList) {
		for(int i=0; i<iList.getSize(); i++) {
			System.out.println(i+1 +". " + iList.getAllIngredientsNames()[i] + " " 
		+ iList.getAllIngredientsCals()[i] + "cal/hg");
		}
	}
	
	public static void addRecipeToList(RecipeList rList, IngredientList iList) {
		String nameRec = InputDati.leggiStringaNonVuota(WifeStrings.NAMEREC);
		String descRec = InputDati.leggiStringaNonVuota(WifeStrings.DESCREC);
		int dish = InputDati.leggiIntero(WifeStrings.DISH, 1, 2);
		Recipe toAdd = new Recipe(nameRec, descRec, dish);
		rList.addToList(toAdd);
		System.out.println(WifeStrings.WHICHING);
		int subMenuFlag = 1;
		String[] submenu = iList.getAllIngredientsNames();
		MyMenu ingmenu = new MyMenu(WifeStrings.WHICHTOADD, submenu);
		while(subMenuFlag!=0) {
			int subchoice = ingmenu.scegli();
			if(subchoice == 0)
				subMenuFlag = 0;
			else
				toAdd.addIngredient(iList.getIngredientAt(subchoice-1));
		}	
	}
	
	public static void displayRecipesFromList(RecipeList rList) {
		for(int i=0; i<rList.getSize(); i++) {
			System.out.println(i+1 + ". " + rList.getAllRecipeNames()[i] + " " + 
		rList.getAllRecipeCals()[i] + "cal/hg");
		}
	}
	
	public static void proposeMenu(RecipeList rList) {
		int maxCals = InputDati.leggiInteroNonNegativo(WifeStrings.MAXCALS);
		Recipe firstDish = findLowestCalsFirstDish(rList);
		Recipe secondDish = findLowestCalsSecondDish(rList);
		if((firstDish.getTotalCals() + secondDish.getTotalCals()) <= maxCals) {
			System.out.println(WifeStrings.PROPOSED);
			System.out.println("1. " +firstDish.getName() +" "+ firstDish.getTotalCals());
			System.out.println("2. " +secondDish.getName() +" "+ secondDish.getTotalCals());
		}
		else
			System.out.println(WifeStrings.CANTPROPOSE);
		
		
	}
	
	private static Recipe findLowestCalsFirstDish(RecipeList rList) {
		Recipe min = null;
		for(int i=0; i<rList.getSize(); i++)
		{
			if(rList.getRecipeAt(i).getDish()==1)
			{
				min = rList.getRecipeAt(i);
				break;
			}
		}		
		for(int i=0; i<rList.getSize(); i++) {
			if(rList.getRecipeAt(i).getDish()==1) {
				if(rList.getRecipeAt(i).getTotalCals()<min.getTotalCals())
					min = rList.getRecipeAt(i);
			}
		}
		return min;
	}
	
	private static Recipe findLowestCalsSecondDish(RecipeList rList) {
		Recipe min = null;
		for(int i=0; i<rList.getSize(); i++)
		{
			if(rList.getRecipeAt(i).getDish()==2)
			{
				min = rList.getRecipeAt(i);
				break;
			}
		}		
		for(int i=0; i<rList.getSize(); i++) {
			if(rList.getRecipeAt(i).getDish()==2) {
				if(rList.getRecipeAt(i).getTotalCals()<min.getTotalCals())
					min = rList.getRecipeAt(i);
			}
		}
		return min;
	}
}
