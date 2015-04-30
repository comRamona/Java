import java.util.Arrays;

public class Question3 {
	public static boolean elem(Object x, Object[] ys) {
		boolean[] map = new boolean[ys.length];
		for (int i = 0; i < ys.length; i++)
			map[i] = (ys[i].equals(x)); // map the function x== to every element
										// of the list of ys
		boolean foldr = false; // foldr starts with False
		for (int i = 0; i < map.length; i++)
			foldr = foldr || map[i]; // go through the map function and apply ||
		return foldr;

	}

	public static boolean elem2(Object x, Object[] ys) {
		for (Object i : ys)
			if (i.equals(x))
				return true; // just check if x is an element of ys
		return false;
	}

	public static boolean elem3(Object x, Object[] ys) {
		Arrays.sort(ys, 0, ys.length);
		return (Arrays.binarySearch(ys, x)) >= 0; // if the object is found the
													// returned value of
													// binarySearch should be
													// >=0
	}

	public static void main(String[] args) {
		// elem2 is the shortest version
		// elem3 is the most efficient, because it does not
		// have to go though all the elements of the list(it uses binary search)
	}
}
