package it.unibs.fp.traffic;
import it.unibs.fp.mylib.*;

public class TrafficRoad {
	private int column=12;
	private int row=4;
	private TrafficElement[][] map = new TrafficElement[row][column];
	
	
	public void fillRoad() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				map[i][j] = choosePlaceholder();
			}
		}
	}
	
	public TrafficElement[][] getMap(){
		return map;
	}
	
	public void displayRoad() {
		for(int i=0; i<row; i++) {
			System.out.println("");
			for(int j=0; j<column; j++) {
				System.out.print("[" + whatToDisplay(map[i][j]) + "]");
			}
		}
		System.out.println("");
	}
	
	public void updateMap() {
		map = TrafficUtils.updateMap(map);
	}
	
	private TrafficElement choosePlaceholder() {
		int choice = EstrazioniCasuali.estraiIntero(1, 15);
		switch (choice){
		case 1:
			return new TrafficPedestrian();
		case 2:
			return new TrafficVehicle();
		}
		return new TrafficEmpty();
	}
	
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
