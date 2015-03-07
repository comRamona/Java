
public class SaferQuadraticSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double A=Double.parseDouble(args[0]);
       double B=Double.parseDouble(args[1]);
       double C=Double.parseDouble(args[2]); 
       double delta=B*B-4*A*C;
       if(delta<0) System.out.println("Equation is not solvable for real x.");
       else
       {if(A==0) System.out.println("A = 0. Cannot solve equation.");
       else{double x1=(-B+Math.sqrt(delta))/(2*A);
       double x2=(-B-Math.sqrt(delta))/(2*A);
       System.out.println(x1+"\n"+x2); } }
       
	}
}
