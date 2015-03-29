
public class Ref { public static String change(String p) { p="wee"; return p;}
public static void main(String[] args) {
	String s="hello";
	s=change(s);
	System.out.println(s);
}

}
