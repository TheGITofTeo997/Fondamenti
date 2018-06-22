package it.unibs.fp.labtest;

/**
 * Class which instances a Round object
 * @author Matr715329
 *
 */
public class Round {
	private Participant p1;
	private Participant p2;
	private int number;
	
	/**
	 * Constructor method for the round object
	 * @param participant1
	 * @param participant2
	 */
	public Round(Participant p1, Participant p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	//Getters
	
	/**
	 * Method which returns the first participant for this round
	 * @return participant1
	 */
	public Participant getFirst() {
		return this.p1;
	}
	
	/**
	 * Method which returns the second participant for this round
	 * @return participant2
	 */
	public Participant getSecond() {
		return this.p2;
	}
	
	/**
	 * Method which returns the number of the current round
	 * @return number
	 */
	public int getNumberOfRound() {
		return this.number;
	}
}
