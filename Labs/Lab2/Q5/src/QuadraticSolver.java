
public class QuadraticSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double A=Double.parseDouble(args[0]);
       double B=Double.parseDouble(args[1]);
       double C=Double.parseDouble(args[2]);
       double delta=Math.pow(B, 2)-4*A*C;
       double x1=(-B+Math.sqrt(delta))/(2*A);
       double x2=(-B-Math.sqrt(delta))/(2*A);
       System.out.println(x1+"\n"+x2);
	}
}
