public class Pair {
	private char c;
	private int i;

	public Pair(char theC, int theI) {
		if (theI < 0) {
			throw new RuntimeException(
					"A Pair can't contain a negative integer!");
		}
		c = theC;
		i = theI;
	}

	public char getChar() {
		return c;
	}

	public int getInt() {
		return i;
	}

	public boolean equals(Object o) {
		try {
			Pair p = (Pair) o;
			return (p.getChar() == c && p.getInt() == i);
		} catch (ClassCastException e) {
			return false;
		}

	}

	public String toString() {
		return "[" + c + "," + i + "]";
	}
}
