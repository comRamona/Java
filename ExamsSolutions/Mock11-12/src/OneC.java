import java.util.ArrayList;
import java.util.HashMap;

public class OneC {

	public static ArrayList<String> findSubstrings(String s, int len) {
		ArrayList<String> sstr = new ArrayList<String>();
		if (len > s.length())
			return sstr;
		int beg = 0;
		while (beg + len <= s.length()) {
			sstr.add(s.substring(beg, beg + len));
			beg++;
		}
		return sstr;

	}

	public static void increment(HashMap<String, Integer> map, String s) {
		if (map.containsKey(s))
			map.put(s, (map.get(s)) + 1);
		else
			map.put(s, 1);
	}

	public static HashMap<String, Integer> findStringCounts(String s) {
		// ADD CODE HERE
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		ArrayList<String> str=findSubstrings(s, 3);
		for(String i:str)
			increment(freq,i);
		return freq;

	}


}
