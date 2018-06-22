package it.unibs.fp.labtest;

import static org.junit.Assert.*;

import org.junit.Test;
public class ListParticipantsTest {
	@Test
	public void participantGetsAdded() {
		final Participant p1 = new Participant("p1");
		final ListParticipants list = new ListParticipants();
		list.addParticipantToList(p1);
		assertTrue(list.getListSize()==1);
	}
	@Test
	public void participantGetsDeletedByIndex() {
		final Participant p1 = new Participant("p1");
		final ListParticipants list = new ListParticipants();
		list.addParticipantToList(p1);
		list.removeParticipantFromListByIndex(0);
		assertTrue(list.getListSize()==0);
	}
	@Test
	public void getParticipantIndexInListByHisName() {
		final Participant p1 = new Participant("p1");
		final Participant p2 = new Participant("p2");
		final ListParticipants list = new ListParticipants();
		list.addParticipantToList(p2);
		list.addParticipantToList(p1);
		assertTrue(list.getParticipantIndexByName("p2")==0);
	}

}
