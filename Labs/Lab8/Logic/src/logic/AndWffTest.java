package logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AndWffTest {

    private PropVar t = new PropVar("T");
    private PropVar f = new PropVar("F");
    private AndWff andTT = new AndWff(t, t);
    private AndWff andTF = new AndWff(t, f);
    private AndWff andFT = new AndWff(f, t);
    private AndWff andFF = new AndWff(f, f);

    @Test
    public void testGetLeft() {
        assertEquals(t, andTF.getLeft());
    }

    @Test
    public void testGetRight() {
        assertEquals(f, andTF.getRight());
    }

    @Test
    public void testGetOp() {
        assertEquals(Operator.AND, andTF.getOp());
    }

    @Test
    public void testEval() {
        Valuation valuation = new Valuation();
        valuation.put(t, true);
        valuation.put(f, false);

        assertTrue(andTT.eval(valuation));
        assertFalse(andTF.eval(valuation));
        assertFalse(andFT.eval(valuation));
        assertFalse(andFF.eval(valuation));
    }
    
    @Test
    public void testToString() {
        assertEquals("(F & T)", andFT.toString());
    }
}
