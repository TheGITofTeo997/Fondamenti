package it.unibs.fp.titoliazionari;

import java.util.ArrayList;
import java.io.File;
/**Class which instances a TitleList Object
 * @author Matr715329 & Matr715805
 */
public class ElencoTitoli{
	private ArrayList <Titolo> myTitles = new ArrayList <Titolo>();
	File titlesList = new File("titlesList.dat");
	/**
	 * Method which adds a title to the list
	 * @param title
	 */
	public void addTitle(Titolo title) {
		myTitles.add(title);
	}
	/**
	 * Method which returns a title at a specific index
	 * @param index
	 * @return title
	 */
	public Titolo getTitleAt(int i)
	{
		return myTitles.get(i);
	}
	/** Method which returns the title name at a specific index
	 * 
	 * @param index
	 * @return titleName
	 */
	public String getTitleNameAt(int i)
	{
		return myTitles.get(i).getName();
	}
	/**
	 * Method which returns the list's size
	 * @return listSize
	 */
	public int getListSize() {
		return myTitles.size();
	}
	/**
	 * Method which returns all the titles names in the list in an array
	 * @return titlesNames
	 */
	public String[] getAllTitleNames() {
		String[] names = new String[myTitles.size()];
		for(int i=0; i<myTitles.size(); i++)
		{
			names[i] = myTitles.get(i).getName();
		}
		return names;
	}
	
}
