import static org.junit.Assert.*;

import org.junit.Test;


public class InequalitiesTest {

	@Test
	public void testDotProduct() {
		int i = Inequalities.dotProduct(new int[] { 2, 1 }, new int[] { 3, 4 });
	}

	@Test
	public void testCS() {
		boolean b = Inequalities.cs(new int[] { 2, 1 }, new int[] { 3, 4 });
	}

	@Test
	public void testConcatenate() {
		int[] i = Inequalities.concatenate(new int[] { 2, 1 }, new int[] { 3, 4 });
	}

	@Test
	public void testAMGM() {
		boolean b = Inequalities.amgm(new int[] { 2, 1 });
	}

	@Test
	public void testMain() {
		Inequalities.main(new String[] { "2", "2", "1", "3", "4" });
	}

}
