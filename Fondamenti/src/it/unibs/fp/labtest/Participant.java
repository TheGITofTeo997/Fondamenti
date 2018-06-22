package it.unibs.fp.labtest;

/**
 * Class which instances a Participant Object
 * @author Matr715329
 *
 */
public class Participant {
	private String name;
	private int winValue;
	public boolean extracted=false;
	
	/**
	 * Constructor method for a Participant Object
	 * @param name 
	 */
	public Participant(String name) {
		this.name = name;
	}
	
	//Setters
	
	/**
	 * Method which sets a points value for the participant
	 * @param value  
	 */
	public void setWinValue(int v) {
		this.winValue = v;
	}
	
	//Getters
	
	/**
	 * Method which returns the name of the participant
	 * @return name	
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Method which returns the value of the points for the participant
	 * @return value
	 */
	public int getWinValue() {
		return this.winValue;
	}

}
