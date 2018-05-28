package it.unibs.fp.titoliazionari;
/**Class which instances a Title Object
 * @author Matr715329 & Matr715805
 */
public class Titolo {
	private String name;
	private double value;
	protected double dailyV;
	/**
	 * Constructor method for Titolo Object Class
	 * 
	 * @param name
	 * @param value
	 */
	public Titolo(String name, double value) {
		this.name = name;
		this.value = value;
	}
	/**
	 * Method which returns the name of the title
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Method which returns the value of the title
	 * @return value
	 */
	public double getValue() {
		return this.value;
	}
	/**
	 * Method which updates the value of the title
	 * @param newCurrent
	 */
	public void updateValue(double newCurrent) {
		this.value = newCurrent;
	}
}
