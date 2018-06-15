package it.unibs.fp.traffic;

/**Class which contains all the utils for the program
 * @author Matr715329
 */
public class TrafficUtils {
	
	/**
	 * Method which updates the current map with the new position of the objects
	 * @param old map
	 * @return new map
	 */
	public static TrafficElement[][] updateMap(TrafficElement[][] map) {
		TrafficElement[][] newMap = emptyMap(map.length, map[0].length);
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
					if(map[i][j] instanceof TrafficVehicle) {
						if(outOfBound(i, j+map[i][j].getMoveStep(), map.length, map[0].length))
						newMap[i][j]=new TrafficEmpty();
						else
						{
							if(newMap[i][j+map[i][j].getMoveStep()] instanceof TrafficPedestrian)
							{
								newMap[i][j] = new TrafficEmpty();
								System.out.println(TrafficStrings.COLLISION);
							}
							else
							newMap[i][j+2]= map[i][j];
						}					
					}
					else if(map[i][j] instanceof TrafficPedestrian) {
						if(outOfBound(i+map[i][j].getMoveStep(), j, map.length, map[0].length))
						newMap[i][j]=new TrafficEmpty();
						else
						newMap[i+map[i][j].getMoveStep()][j]= map[i][j];
					}
				}
			}
			return newMap;
		}
	
	/**
	 * Method which checks if the position goes out of matrix bounds
	 * @param desiredRow
	 * @param desiredColumn
	 * @param maxRow
	 * @param maxColumn
	 * @return true or false
	 */
	public static boolean outOfBound(int desiredRow, int desiredColumn, int maxRow, int maxColumn) {
		if(desiredRow >= maxRow || desiredColumn >= maxColumn) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method which creates an empty map
	 * @param row
	 * @param columns
	 * @return a new empty map
	 */
	public static TrafficElement[][] emptyMap(int row, int columns){
		TrafficElement[][] map = new TrafficElement[row][columns];
		for(int i=0;i<row; i++) {
			for(int j=0;j<columns;j++) {
				map[i][j]=new TrafficEmpty();
			}
		}
		return map;
	}
	
	/**
	 * Method which checks if a map is completely empty
	 * @param map
	 * @return true or false
	 */
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
