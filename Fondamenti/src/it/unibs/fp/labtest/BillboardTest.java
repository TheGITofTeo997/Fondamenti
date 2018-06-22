package it.unibs.fp.labtest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BillboardTest {
	@Test
	public void roundGetsAdded() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final Round r = new Round(p1,p2);
		final Billboard board = new Billboard();
		board.addRound(r);
		assertTrue(board.getBoardSize()==1);
	}
	
	@Test
	public void roundGetsDeleted() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final Round r = new Round(p1,p2);
		final Billboard board = new Billboard();
		board.addRound(r);
		board.deleteRound(r);
		assertTrue(board.getBoardSize()==0);
	}
	
	@Test
	public void boardGetsCleared() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final Round r = new Round(p1,p2);
		final Billboard board = new Billboard();
		board.addRound(r);
		board.addRound(r);
		board.addRound(r);
		board.clearBillboard();
		assertTrue(board.getBoardSize()==0);
	}
	
	@Test
	public void boardIsCorrectSize() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final Round r = new Round(p1,p2);
		final Billboard board = new Billboard();
		board.addRound(r);
		board.addRound(r);
		assertTrue(board.getBoardSize()==2);
	}
	
	

}
