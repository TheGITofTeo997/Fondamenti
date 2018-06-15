package it.unibs.fp.traffic;
import it.unibs.fp.mylib.*;

/**Class which instances a Road Object
 * @author Matr715329
 */
public class TrafficRoad {
	private int column=12;
	private int row=4;
	private TrafficElement[][] map = new TrafficElement[row][column];
	
	/**
	 * Method which fills the road with its elements
	 */
	public void fillRoad() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				map[i][j] = choosePlaceholder();
			}
		}
	}
	
	/**
	 * Method which returns the map
	 * @return map
	 */
	public TrafficElement[][] getMap(){
		return map;
	}
	
	/**
	 * Method which displays the map
	 */
	public void displayRoad() {
		for(int i=0; i<row; i++) {
			System.out.println("");
			for(int j=0; j<column; j++) {
				System.out.print("[" + whatToDisplay(map[i][j]) + "]");
			}
		}
		System.out.println("");
	}
	
	/**
	 * Method which updates the map
	 */
	public void updateMap() {
		map = TrafficUtils.updateMap(map);
	}
	
	/**
	 * Method which chooses which element to place
	 * @return a Traffic element
	 */
	private TrafficElement choosePlaceholder() {
		int choice = EstrazioniCasuali.estraiIntero(1, 10);
		switch (choice){
		case 1:
			return new TrafficPedestrian();
		case 2:
			return new TrafficVehicle();
		}
		return new TrafficEmpty();
	}
	
	/**
	 * Method which chooses which letter to display corresponding to the object
	 * @param element
	 * @return string with the letter of the element
	 */
	private String whatToDisplay(TrafficElement e) {
		String toReturn;
		if(e instanceof TrafficPedestrian) {
			toReturn = "P";
		}
		else if(e instanceof TrafficVehicle) {
			toReturn = "C";
		}
		else {
			toReturn = " ";
		}
		return toReturn;
	}
}
