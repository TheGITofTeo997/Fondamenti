package it.unibs.fp.traffic;

public class TrafficUtils {
	
	public static TrafficElement[][] updateMap(TrafficElement[][] map) {
		TrafficElement[][] newMap = emptyMap(map.length, map[0].length);
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
					if(map[i][j] instanceof TrafficVehicle) {
						if(outOfBound(i, j+2, map.length, map[0].length))
						newMap[i][j]=new TrafficEmpty();
						else
						newMap[i][j+2]= map[i][j];
					}
					else if(map[i][j] instanceof TrafficPedestrian) {
						if(outOfBound(i+1, j, map.length, map[0].length))
						newMap[i][j]=new TrafficEmpty();
						else
						newMap[i+1][j]= map[i][j];
					}
				}
			}
			return newMap;
		}
	
	public static boolean outOfBound(int desiredRow, int desiredColumn, int maxRow, int maxColumn) {
		if(desiredRow >= maxRow || desiredColumn >= maxColumn) {
			return true;
		}
		return false;
	}
	
	
	public static TrafficElement[][] emptyMap(int row, int columns){
		TrafficElement[][] map = new TrafficElement[row][columns];
		for(int i=0;i<row; i++) {
			for(int j=0;j<columns;j++) {
				map[i][j]=new TrafficEmpty();
			}
		}
		return map;
	}
	
	public static boolean checkIfEmpty(TrafficElement[][] map)
	{
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
				if(map[i][j] instanceof TrafficEmpty == false)
					return false;
			}
		}
		return true;
	}
}
