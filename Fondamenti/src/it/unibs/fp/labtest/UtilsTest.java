package it.unibs.fp.labtest;
import static org.junit.Assert.*;


import org.junit.Test;
public class UtilsTest {
	@Test
	public void extractionGetsReset() {
		final Participant p1 = new Participant("p1");
		final ListParticipants list = new ListParticipants();
		p1.extracted = true;
		list.addParticipantToList(p1);
		TournamentUtils.resetExtraction(list);
		assertTrue(p1.extracted==false);
	}
	
	@Test
	public void winnerGetsChosen() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		p1.setWinValue(10);
		p2.setWinValue(5);
		final Round r = new Round(p1,p2);
		assertTrue(TournamentUtils.chooseWinner(r).equals(p1));
	}
	
	@Test 
	public void pointsGetAssigned() {
		final Participant p1 = new Participant("p1");
		final ListParticipants list= new ListParticipants();
		list.addParticipantToList(p1);
		TournamentUtils.assignPoints(list);
		assertTrue(p1.getWinValue()>=0 && p1.getWinValue()<=10);
	}
	
	@Test 
	public void isPowOfTwo() {
		int n=4;
		assertTrue(TournamentUtils.isPowOfTwo(n));
	}
	
	@Test
	public void roundGetsGenerated() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final ListParticipants list= new ListParticipants();
		final Billboard board = new Billboard();
		list.addParticipantToList(p1);
		list.addParticipantToList(p2);
		TournamentUtils.generateRound(list, board);
		assertFalse(board.getBoardSize()==0);
	}
}
