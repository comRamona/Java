//SMR 144 Div1 250
public class BinaryCode {
	public static String[] decode(String message) {
		String[] st = new String[2];
		if (message.length() == 0) {
			st[0] = "NONE";
			st[1] = "NONE";
		} else if (message.length() > 1) {
			String Q = message;
			String P = "0";
			String last = "";
			P += Q.charAt(0);
			boolean w = true;
			for (int i = 2; i < Q.length() - 1; i++) {
				last = Integer.toString(Integer.parseInt(Q.charAt(i - 1) + "")
						- Integer.parseInt(P.charAt(i - 1) + "")
						- Integer.parseInt(P.charAt(i - 2) + ""));
				if (!last.equals("0") && !last.equals("1")) {
					w = false;
					break;
				} else
					P += last;
			}
			if (w == true && message.length() > 2) {
				last = Integer
						.toString(Integer.parseInt(Q.charAt(Q.length() - 1)
								+ "")
								- Integer.parseInt(P.charAt(Q.length() - 2)
										+ ""));
				if (!last.equals("0") && !last.equals("1")) {
					w = false;
				} else
					P += last;
			}

			st[0] = P;
			if (w == false)
				st[0] = "NONE";
			st[1] = "None";
			P = "1";
			P += Integer.toString(Integer.parseInt(Q.charAt(0) + "")
					- Integer.parseInt("1"));
			w = true;
			for (int i = 2; i < Q.length() - 1; i++) {
				last = Integer.toString(Integer.parseInt(Q.charAt(i - 1) + "")
						- Integer.parseInt(P.charAt(i - 1) + "")
						- Integer.parseInt(P.charAt(i - 2) + ""));
				if (!last.equals("0") && !last.equals("1")) {
					w = false;
					break;
				} else
					P += last;
			}
			if (w == true && message.length() > 2) {
				last = Integer
						.toString(Integer.parseInt(Q.charAt(Q.length() - 1)
								+ "")
								- Integer.parseInt(P.charAt(Q.length() - 2)
										+ ""));
				if (!last.equals("0") && !last.equals("1")) {
					w = false;
				} else
					P += last;
			}
			st[1] = P;
			if (w == false)
				st[1] = "NONE";
		} else {
			if (message.equals("0")) {
				st[0] = "0";
				st[1] = "NONE";
			} else if (message.equals("")) {
				st[0] = "1";
				st[0] = "NONE";
			} else {
				st[0] = "NONE";
				st[1] = "NONE";
			}
		}
		return st;
	}

	public static void main(String[] args) {
		System.out.println(decode("11")[0] + decode("11")[1]);
	}
}

