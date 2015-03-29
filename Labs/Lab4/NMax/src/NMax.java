
public class NMax {

	/**
	 * @param args
	 */
	public static int max(int a, int b) {if(a>b) return a; else return b;}
	public static double max(double a, double b) {if(a>b) return a; else return b;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=StdIn.readInt();
		int b=StdIn.readInt();
		System.out.println(max(a,b));

	}

}
