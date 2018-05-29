package it.unibs.fp.medagliere;

import java.io.*;
import java.util.*;

public class MedalCountry {
	private String Cname;	
	private int Bronze;
	private int Silver;
	private int Gold;
	
	public MedalCountry(String Cname) {
		this.Cname = Cname;		
	}
	
	public String getCountryName() {
		return this.Cname;
	}
	
	public void addBronzes(int n){
		this.Bronze+=n;
	}
	
	public void addSilvers(int n){
		this.Silver+=n;
	}
	
	public void addGolds(int n){
		this.Gold+=n;
	}
	
	public int getBronzesNumber() {
		return this.Bronze;
	}
	
	public int getSilversNumber() {
		return this.Silver;
	}	
	
	public int getGoldsNumber() {
		return this.Gold;
	}
}
