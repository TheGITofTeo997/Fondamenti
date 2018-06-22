package it.unibs.fp.labtest;

import java.util.*;

/**
 * Class which instances a ListParticipants object
 * @author Matr715329
 *
 */
public class ListParticipants {
	private ArrayList<Participant> list = new ArrayList<>();
	
	/**
	 * Method which adds a participant to the list
	 * @param participant
	 */
	public void addParticipantToList(Participant p) {
		list.add(p);
	}
	
	/**
	 * Method which removes a participant from the list with a given index
	 * @param index
	 */
	public void removeParticipantFromListByIndex(int i) {
		list.remove(i);
	}
	
	/**
	 * Method which returns the index of a participant from the list by his name
	 * @param name
	 * @return index
	 */
	public int getParticipantIndexByName(String name) {
		for(int i=0; i<list.size();i++) {
			if(name.equals(list.get(i).getName()))
				return i;
		}
		return list.size()+1;
	}
	
	//Getters
	
	/**
	 * Method which returns a specific participant at a specific index
	 * @param index
	 * @return participant
	 */
	public Participant getParticipantAt(int index) {
		return list.get(index);
	}
	
	/**
	 * Method which returns the size of the participants list
	 * @return size
	 */
	public int getListSize() {
		return list.size();
	}

}
