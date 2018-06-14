package it.unibs.fp.traffic;
import it.unibs.fp.mylib.*;

public class TrafficRoad {
	private int length=12;
	private int height=4;
	private TrafficElement[][] map = new TrafficElement[height][length];
	
	
	public void fillRoad() {
		for(int i=0; i<height; i++) {
			for(int j=0; j<length; j++) {
				map[i][j] = choosePlaceholder();
			}
		}
	}
	
	public void displayRoad() {
		for(int i=0; i<height; i++) {
			System.out.println("");
			for(int j=0; j<length; j++) {
				System.out.print("[" + whatToDisplay(map[i][j]) + "]");
			}
		}
		System.out.println("");
	}
	
	private TrafficElement choosePlaceholder() {
		int choice = EstrazioniCasuali.estraiIntero(1, 6);
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
