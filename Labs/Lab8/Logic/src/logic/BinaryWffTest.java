package logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class BinaryWffTest {

    // As BinaryWff is abstract, we need to extend it to test it
    private static class TestWff extends BinaryWff {

        public TestWff(Wff left, Wff right) {
            super(left, right);
        }

        @Override
        public boolean eval(Valuation val) {
            return false;
        }
    }

    @Test
    public void testBinaryWff() {
        Wff p = new PropVar("P");
        Wff q = new PropVar("Q");
        Wff wff = new TestWff(p, q);
        BinaryWff testWff = new TestWff(p, wff);
        assertEquals(p, testWff.getLeft());
        assertEquals(wff, testWff.getRight());
        assertEquals(q, ((BinaryWff) testWff.getRight()).getRight());
        assertNull(testWff.getOp());
        assertEquals("(P null (P null Q))", testWff.toString());
    }

}
