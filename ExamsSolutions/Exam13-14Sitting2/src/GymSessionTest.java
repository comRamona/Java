import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GymSessionTest {
	
	GymSession g;

	@Before
	public void setUp()  {
		g = new GymSession("Gym", "The Pleasance");
	}

	@Test
	public void testToString() {
		String s = g.toString();
	}

	@Test
	public void testAddMachine() {
		// Passing null for the Length, so that if the student's Length code is all
		// wrong but their GymSession code is OK, we don't make this test
		// fail - only their Length tests should fail in that case.
		g.addMachine("Treadmill", null);
	}

}
