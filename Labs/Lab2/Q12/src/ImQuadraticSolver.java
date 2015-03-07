
public class ImQuadraticSolver {
  public static void main(String[] args) {
	  double A=Double.parseDouble(args[0]);
      double B=Double.parseDouble(args[1]);
	  double C=Double.parseDouble(args[2]);
	  double delta=B*B-4*A*C;
	  if(A==0){ double x=-C/B; System.out.println(x); }
	  else {
	  if(delta>=0) { double x1=(-B+Math.sqrt(delta))/(2*A); double x2=(-B-Math.sqrt(delta))/(2*A); System.out.println(x1+"\n"+x2);}
	      else { double re=-B/(2*A); double im=(Math.sqrt(Math.abs(delta)))/(2*A); 
	          System.out.println(re+" + "+im+"i"+"\n"+re+" - "+im+"i");}
	  }
		  
  }
}
