import static org.junit.Assert.*;

import org.junit.Test;


public class RearrangementTest {

	@Test
	public void testDotWith() {
		int i = Rearrangement.dotWith(new int[] { 2, 1 }, new int[] { 3, 4 });
	}

	@Test
	public void testRotate() {
		int[] b = new int[] { 1, 2, 3 };
		Rearrangement.rotate(b);
	}

	@Test
	public void testUseSorted() {
		int i = Rearrangement.useSorted(new int[] { 2, 1 }, new int[] { 3, 4 });
	}

	@Test
	public void testUseRotations() {
		int i = Rearrangement.useRotations(new int[] { 2, 1 },
				new int[] { 3, 4 });
	}

	@Test
	public void testMain() {
		Rearrangement.main(new String[] { "2", "2", "1", "3", "4" });
	}

}
