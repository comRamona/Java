
public class BooleanExpr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=Boolean.parseBoolean(args[0]);
		boolean b=Boolean.parseBoolean(args[1]);
		boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
		System.out.println("a: "+a+"\n"+"b: "+b+"\n"+"phi: "+phi);
	}

}
