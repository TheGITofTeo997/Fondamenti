package it.unibs.fp.labtest;
import static org.junit.Assert.*;

import org.junit.Test;

public class RoundTest {
	@Test
	public void roundGetsFirstParticipant() {
		final Participant p1 = new Participant("John");
		final Participant p2 = new Participant("Simon");
		final Round r = new Round(p1,p2);
		assertTrue(r.getFirst().getName().equals("John"));
	}
	
	@Test
	public void roundGetsSecondParticipant() {
		final Participant p1 = new Participant("John");
		final Participant p2 = new Participant("Simon");
		final Round r = new Round(p1,p2);
		assertTrue(r.getSecond().getName().equals("Simon"));
	}
}
