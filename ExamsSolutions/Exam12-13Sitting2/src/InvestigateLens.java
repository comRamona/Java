import java.util.Arrays;

public class InvestigateLens {
	/*public static boolean checkPutGet(String[] source) {
		boolean w = true;
		String[] s = Lens.put(source, Lens.get(source));       //use Arrays.equals instead
		for (int i = 0; i < source.length; i++)
			w = w && source[i].equals(s[i]);
		return w;

	}*/
	public static boolean checkPutGet(String[] source) {
		String[] s = Lens.put(source, Lens.get(source));
		return Arrays.equals(source, s);                 //check if two arrays are equal

	}

	public static void main(String[] args) {
		boolean w = true;
		String[][] s = { { "FOO" }, { "foo", "BAR", "frObOz" },
				{ "foo", "bar", "FROBOZ" } };
		for (int i = 0; i < 3; i++) {
			System.out.println(checkPutGet(s[i]));
			w = w && checkPutGet(s[i]);
		}
		System.out.println(w);
	}

}
