package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;
/**Class which instances a MedalCountry object
 * @author Matr715329 & Matr715805
 */
public class MedalCountry {
	private String Cname;	
	private int Bronze;
	private int Silver;
	private int Gold;
	/**
	 * Constructor method
	 * @param Cname
	 */
	public MedalCountry(String Cname) {
		this.Cname = Cname;		
	}
	/**
	 * Method which returns the name of the country
	 * @return name
	 */
	public String getCountryName() {
		return this.Cname;
	}
	/**
	 * Method which adds bronze medals to the country
	 * @param n
	 */
	public void addBronzes(int n){
		this.Bronze+=n;
	}
	/**
	 * Method which adds silver medals to the country
	 * @param n
	 */
	public void addSilvers(int n){
		this.Silver+=n;
	}
	/**
	 * Method which adds gold medals to the country
	 * @param n
	 */
	public void addGolds(int n){
		this.Gold+=n;
	}
	/**
	 * Method which return the number of the bronze medals of the country
	 */
	public int getBronzesNumber() {
		return this.Bronze;
	}
	/**
	 * Method which return the number of the silver medals of the country
	 */
	public int getSilversNumber() {
		return this.Silver;
	}	
	/**
	 * Method which return the number of the gold medals of the country
	 */
	public int getGoldsNumber() {
		return this.Gold;
	}
}
