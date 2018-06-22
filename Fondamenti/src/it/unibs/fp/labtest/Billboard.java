package it.unibs.fp.labtest;

import java.util.*;

/**
 * Class which instances a Billboard object
 * @author Matr715329
 *
 */
public class Billboard {
	private ArrayList<Round> roundList = new ArrayList<>();
	
	/**
	 * Method which adds a round to the list
	 * @param round
	 */
	public void addRound(Round r) {
		roundList.add(r);
	}
	
	/**
	 * Method which deletes a round from the list
	 * @param round
	 */
	public void deleteRound(Round r) {
		roundList.remove(r);
	}
	
	/**
	 * Method that clears the billboard list
	 */
	public void clearBillboard() {
		roundList.clear();
	}
	//Getters
	
	/**
	 * Method which returns the size of the billboard
	 * @return size
	 */
	public int getBoardSize() {
		return roundList.size();
	}
	
	/**
	 * Method which returns a round at a specific index
	 * @param index 
	 * @return round
	 */
	public Round getRound(int n) {
		return roundList.get(n);
	}
}
