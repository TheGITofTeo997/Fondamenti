package it.unibs.fp.labtest;

import it.unibs.fp.mylib.*;

/**
 * Class which contains all the utility methods for the program
 * @author 715329
 *
 */
public class TournamentUtils {
	public static final int MINPART = 2;
	public static final int MAXPOINTS = 10;
	
	/**
	 * Method which checks if a number is a power of 2
	 * @param number
	 * @return true or false
	 */
	public static boolean isPowOfTwo(int n) {
	       while (n!=1)
	        {
	            if (n%2!=0)
	                return false;
	            n=n/2;
	        }
	        return true;
	}
	
	/**
	 * Method which fills the list with the participants
	 * @param list
	 * @param dimension of the list
	 */
	public static void fillList(ListParticipants list, int n) {
		for(int i=0; i<n; i++) {
			String name = InputDati.leggiStringaNonVuota(TournamentStrings.INSERTNAME + (i+1) +":");
			list.addParticipantToList(new Participant(name));
		}
	}
	
	/**
	 * Method which generates rounds from a list of participants
	 * @param list
	 * @param board
	 */
	public static void generateRound(ListParticipants list, Billboard board) {
		for(int i=0; i<list.getListSize()/2; i++) {
			boolean canProceed=false;
			while(!canProceed) {
				int random1 = NumeriCasuali.estraiIntero(0, list.getListSize()-1);
				int random2 = NumeriCasuali.estraiIntero(0, list.getListSize()-1);
				if(random1!=random2 && list.getParticipantAt(random1).extracted==false && list.getParticipantAt(random2).extracted
						==false) {
					canProceed = true;
					board.addRound(new Round(list.getParticipantAt(random1), list.getParticipantAt(random2)));
					list.getParticipantAt(random1).extracted=true;
					list.getParticipantAt(random2).extracted=true;
				}
			}		
		}
	}
	
	/**
	 * Method which assigns points to a list of participants
	 * @param list
	 */
	public static void assignPoints(ListParticipants list) {
		for(int i=0; i<list.getListSize(); i++)
		{
			int points = NumeriCasuali.estraiIntero(0, MAXPOINTS);
			list.getParticipantAt(i).setWinValue(points);
		}
	}
	
	/**
	 * Method which removes the losers participants from the list
	 * @param list
	 * @param board
	 */
	public static void cleanLosers(ListParticipants list, Billboard board) {
		for(int i=0; i<board.getBoardSize();i++) {
			Round r = board.getRound(i);
			String nameToRemove;
			if(r.getFirst().getWinValue()>r.getSecond().getWinValue()) {
				nameToRemove = r.getSecond().getName();
				list.removeParticipantFromListByIndex(list.getParticipantIndexByName(nameToRemove));
			}
			else
			{
				nameToRemove =r.getFirst().getName();
				list.removeParticipantFromListByIndex(list.getParticipantIndexByName(nameToRemove));
			}
		}
	}
	
	/**
	 * Method which resets the extraction value for each participant
	 * @param list
	 */
	public static void resetExtraction(ListParticipants list) {
		for(int i=0; i<list.getListSize(); i++) {
			list.getParticipantAt(i).extracted = false;
		}
	}
	
	/**
	 * Method which show the current rounds in billboard
	 * @param board
	 */
	public static void showRound(Billboard board) {
		for(int i=0; i<board.getBoardSize();i++) {
			System.out.println(TournamentStrings.ROUND + (i+1));
			Round r = board.getRound(i);
			System.out.println(r.getFirst().getName() + " "+ r.getFirst().getWinValue() +" " + 
					TournamentStrings.POINTS + "|" + r.getSecond().getName() + " " + r.getSecond().getWinValue() +
					" " + TournamentStrings.POINTS);
			Participant winner = chooseWinner(r);
			System.out.println(winner.getName() + TournamentStrings.HASWON);
			
		}
	}
	
	public static Participant chooseWinner(Round r) {
		if(r.getFirst().getWinValue()>r.getSecond().getWinValue())
			return r.getFirst();
		return r.getSecond();
	}
		
}
