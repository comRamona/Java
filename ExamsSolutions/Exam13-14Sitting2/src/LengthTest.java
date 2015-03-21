import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LengthTest {

	Length length;
	
	@Before
	public void setUp() {
		length = new Length();
	}

	@Test
	public void testGetUnits() {
		String s = length.getUnits();
	}

	@Test
	public void testSetUnits() {
		length.setUnits("km");
	}

	@Test
	public void testGetNumber() {
		int i = length.getNumber();
	}

	@Test
	public void testSetNumber() {
		length.setNumber(1);
	}

	@Test
	public void testToString() {
		String s = length.toString();
	}

	@Test
	public void testConvert() {
		length.convert("km", 1.0);
	}

}
