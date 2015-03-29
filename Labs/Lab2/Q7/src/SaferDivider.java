
public class SaferDivider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		if(y==0) System.out.println("I can't divide by zero!");
		else
			System.out.println(x/y);
	}

}
