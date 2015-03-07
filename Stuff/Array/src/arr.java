import java.io.*;
public class arr {
     public static void thing() { System.out.println("hi");}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(r.readLine());
		int n=Integer.parseInt(r.readLine());
		
       for(int i=0;i<m;i++)
    	   {for(int j=0;j<n;j++)
    		   System.out.print("*");
    	   System.out.println();}
       arr.thing();
	}

}
