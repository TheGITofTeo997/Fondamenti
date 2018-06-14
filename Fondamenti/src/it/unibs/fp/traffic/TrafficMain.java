package it.unibs.fp.traffic;
import it.unibs.fp.mylib.*;

public class TrafficMain {

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
				break;
			case 0:
				needToExit = true;
			}
		}
	}
	
	public static void welcome() {
		System.out.println(TrafficStrings.SEPARATOR);
		System.out.println(TrafficStrings.WELCOME);
		System.out.println(TrafficStrings.SEPARATOR);
	}

}
