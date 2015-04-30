public class Question4 {
	public static String findStudentIds(String q) {
		String result = "";
		boolean w = false;
		if (q.charAt(0) == 's' || q.charAt(0) == 'S') {
			w = true;
			for (int i = 1; i <= 7; i++)
				if (!Character.isDigit(q.charAt(i)))
					w = false;
			if (!Character.isWhitespace(q.charAt(8)))
				w = false;
		}
		if (w == true)
			result += q.substring(0, 8) + ",";
		w = false;
		for (char s = 8;s <= q.length() - 8; s ++) {
			boolean t = false;
			if (q.charAt(s) == 's' || q.charAt(s) == 'S') {
				t = true;
				for (int i = s + 1; i <= s+7 && i < q.length() - 8; i++)
					if (!Character.isDigit(q.charAt(i)))
						t = false;
				if (!Character.isWhitespace(q.charAt(s + 8)))
					t = false;
				if (!Character.isWhitespace(q.charAt(s - 1)))
					t = false;
			}
			if (t == true)
				result += q.substring(s, s + 8) + ",";
		}
		return result.substring(0,result.length()-1);

	}

	public static void main(String[] args) {
		String s1 = "s1427590 and S1234567 and especially s0000001 but never s876";
		System.out.println(findStudentIds(s1));
	}

}
