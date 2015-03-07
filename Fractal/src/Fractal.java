
import javax.swing.*;

public class Fractal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int l,n;
		 String getL,getN;
		 getL = JOptionPane.showInputDialog("hei", "Please enter length");
		 getN = JOptionPane.showInputDialog(null, "Please enter number of iterations");
		 n=Integer.parseInt(getN);
		 l=Integer.parseInt(getL);
		 double q;
		 q=4*Math.pow((5.0/3),n)*l;
		 System.out.println((int) q);

	}

}
