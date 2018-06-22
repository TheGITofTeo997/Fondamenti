package it.unibs.fp.labtest;
import static org.junit.Assert.*;

import org.junit.Test;
public class ParticipantTest {
	@Test
	public void participantName() throws Exception{
		final Participant p1 = new Participant("John");
		assertTrue(p1.getName().equals("John"));
	}
	
	@Test
	public void participantWinValue() throws Exception{
		final Participant p1 = new Participant("John");
		p1.setWinValue(10);
		assertTrue(p1.getWinValue()==10);
	}
}
