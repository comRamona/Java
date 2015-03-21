import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CostTest {

	Cost c;
	
	@Before
	public void setUp() {
		c = new Cost();
	}

	@Test
	public void testGetCurrency() {
		String s = c.getCurrency();
	}

	@Test
	public void testSetCurrency() {
		c.setCurrency("pounds sterling");
	}

	@Test
	public void testGetAmount() {
		int i = c.getAmount();
	}

	@Test
	public void testSetAmount() {
		c.setAmount(1);
	}

	@Test
	public void testToString() {
		String s = c.toString();
	}

	@Test
	public void testConvert() {
		c.convert("pounds sterling", 1.0);
	}

}
