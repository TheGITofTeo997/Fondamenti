package it.unibs.fp.labtestsimulation;

import it.unibs.fp.mylib.*;

public class WifeMain {

	public static void main(String[] args) {
		welcome();
		IngredientList ingList = new IngredientList();
		RecipeList recList = new RecipeList();
		String[] menu = new String[] {WifeStrings.ADDINGR, WifeStrings.VIEWINGR, WifeStrings.ADDREC, 
				WifeStrings.VIEWREC, WifeStrings.MAKEMENU};
		MyMenu wifemenu = new MyMenu(WifeStrings.CHOICE, menu);
		boolean needToExit = false;
		while(!needToExit) {
			int choice = wifemenu.scegli();
			switch(choice) {
			case 1:
				WifeUtils.addIngredientToList(ingList);
				break;
			case 2:
				WifeUtils.displayIngredientsFromList(ingList);
				break;
			case 3:
				WifeUtils.addRecipeToList(recList, ingList);
				break;
			case 4:
				WifeUtils.displayRecipesFromList(recList);
				break;
			case 5:
			    WifeUtils.proposeMenu(recList);
				break;
			case 0:
				needToExit = true;
			}
		}
	}
	
	public static void welcome() {
		System.out.println(WifeStrings.SEPARATOR);
		System.out.println(WifeStrings.WELCOME);
		System.out.println(WifeStrings.SEPARATOR);
	}

}
