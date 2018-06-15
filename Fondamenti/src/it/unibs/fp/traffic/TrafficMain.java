package it.unibs.fp.traffic;
import it.unibs.fp.mylib.*;

/**Main Class of Title Project
 * @author Matr715329
 */
public class TrafficMain {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		welcome();
		boolean needToExit=false;
		TrafficRoad road = new TrafficRoad();
		road.fillRoad();
		String[] menu = new String[]{TrafficStrings.PROCEED};
		MyMenu trafficmenu = new MyMenu(TrafficStrings.M_TITLE, menu);
		road.displayRoad();
		while(needToExit!=true) {
			int choice = trafficmenu.scegli();
			switch(choice) {
			case 1:
				road.updateMap();
				road.displayRoad();
				if(TrafficUtils.checkIfEmpty(road.getMap()))
				{
					System.out.println(TrafficStrings.END);
					needToExit = true;
				}
				break;
			case 0:
				needToExit = true;
			}
		}
	}
	
	/**
	 * Method which welcomes you to the program
	 * 
	 */
	public static void welcome() {
		System.out.println(TrafficStrings.SEPARATOR);
		System.out.println(TrafficStrings.WELCOME);
		System.out.println(TrafficStrings.SEPARATOR);
	}

}
