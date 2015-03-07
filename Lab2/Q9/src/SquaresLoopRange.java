
public class SquaresLoopRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=Integer.parseInt(args[0]);
      int b=Integer.parseInt(args[1]);
      if(a>b) System.out.println("Start-limit greater than stop-limit!");
      else
    	  for(int i=a;i<=b;i++)
    		  System.out.print(i*i+" ");
	}

}
