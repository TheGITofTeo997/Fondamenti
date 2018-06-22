package it.unibs.fp.labtest;

import it.unibs.fp.mylib.*;

/**
 * Main class of the Lab Test
 * @author Matr715329
 *
 */
public class TournamentMain {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		welcome();
		ListParticipants listPart = new ListParticipants();
		Billboard board = new Billboard();
		int nPart=0;
		boolean canProceed = false;
		while(!canProceed) {
			nPart = InputDati.leggiInteroConMinimo(TournamentStrings.HOWMANY, TournamentUtils.MINPART);
			if(TournamentUtils.isPowOfTwo(nPart))
				canProceed = true;
			else
				System.out.println(TournamentStrings.WARNINGPOW);
		}
		TournamentUtils.fillList(listPart, nPart);
		for(int i=0; i<nPart-1;i++)
		{
			board.clearBillboard();
			TournamentUtils.generateRound(listPart, board);
			System.out.println(TournamentStrings.SEPARATOR);
			TournamentUtils.assignPoints(listPart);
			TournamentUtils.showRound(board);
			TournamentUtils.cleanLosers(listPart, board);
			TournamentUtils.resetExtraction(listPart);
			
		}
	}

	
	/**
	 * Method which welcomes you to the program
	 */
	public static void welcome() {
		System.out.println(TournamentStrings.SEPARATOR);
		System.out.println(TournamentStrings.WELCOME);
		System.out.println(TournamentStrings.SEPARATOR);
	}
}
