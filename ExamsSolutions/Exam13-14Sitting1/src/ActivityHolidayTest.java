import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ActivityHolidayTest {
	
	ActivityHoliday a;

	@Before
	public void setUp()  {
		a = new ActivityHoliday("Glasgow", 14);
	}

	@Test
	public void testToString() {
		String s = a.toString();
	}

	@Test
	public void testAddActivity() {
		// Passing null for the Cost, so that if the student's Cost code is all
		// wrong but their ActivityHoliday code is OK, we don't make this test
		// fail - only their Cost tests should fail in that case.
		a.addActivity("Hunterian Museum", null);
	}

}
