
public class PolarCoordinates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double R=Math.sqrt(x*x+y*y);
		double teta=Math.atan2(y,x);
		System.out.println(R+"\n"+teta);
	}

}
