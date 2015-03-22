public class Lens {
	private static int upper(String x) {
		int nr = 0;
		for (int i = 0; i < x.length(); i++)
			if (Character.isUpperCase(x.charAt(i)))
				nr++;
		return nr;
	}

	public static Pair[] get(String[] source) {
		// ADD CODE HERE
		Pair[] res = new Pair[source.length];
		for (int i = 0; i < source.length; i++)
			res[i] = new Pair(source[i].charAt(0), upper(source[i]));
		return res;

	}

	private static String exes(int n) {
		String s = "";
		for (int i = 1; i <= n; i++)
			s = s.concat("X");
		return s;
	}

	public static String[] create(Pair[] view) {
		String[] ad = new String[view.length];
		for (int i = 0; i < view.length; i++)
			ad[i] = view[i].getChar() + exes(view[i].getInt());
		return ad;

	}

	public static String[] put(String[] oldSource, Pair[] newView) {
		// Check that the old source and new view have same length.
		// If they do not, report an error and stop the whole program.
		if (!(oldSource.length == newView.length)) {
			throw new RuntimeException("Length of view and source didn't match");
		}
		// if we get here at all, we know oldSource.length == newView.length
		for (int i = 0; i < oldSource.length; i++)
			if (Character.toLowerCase(oldSource[i].charAt(0)) != Character.toLowerCase(newView[i].getChar()))
				throw new RuntimeException("First characters don't match");
		
	    String[] res=new String[oldSource.length];
	    for(int i=0;i<oldSource.length;i++)
	    	if(upper(oldSource[i])>=newView[i].getInt()) 
	    		res[i]=oldSource[i];
	    	else 
	    		res[i]=oldSource[i]+exes(newView[i].getInt()-upper(oldSource[i]));
	    return res;

	}

	public static void main(String[] args) {
		String[] w = { "foO", "Wjkds7", "QTY" };
		Pair[] r = get(w);
		for (int i = 0; i < r.length; i++)
			System.out.print(r[i]);
		System.out.println();
		String[] s = create(new Pair[] { new Pair('F', 2), new Pair('b', 0),
				new Pair('f', 5) });
		for (String i : s)
			System.out.print(i + " ");
		System.out.println();
		String[] p=put (new String[] {"foo", "BAR", "frObOz"},
				new Pair[] {new Pair('f',2), new Pair('b',0), new Pair('f',5)});
		for(String i:p)
			System.out.print(i+" ");
		System.out.println();
		String[] q=put (new String[] {"foo", "bar", "FROBOZ"},
				new Pair[] {new Pair('f',1), new Pair('b',6), new Pair('f',3)});
		for(String i:q)
			System.out.print(i+" ");
		System.out.println();
		String[] a = { "FOO"};
		Pair[] b = get(a);
		String [] test=put(a,get(a));
		System.out.println();
		for(String i:test)
			System.out.print(i);
		System.out.println(a==put(a,get(a)));
	}
}
