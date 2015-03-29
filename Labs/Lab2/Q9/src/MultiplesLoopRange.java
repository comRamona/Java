
public class MultiplesLoopRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a=Integer.parseInt(args[0]);
		   int b=Integer.parseInt(args[1]);
		   int m=Integer.parseInt(args[2]); 
		   if(a<b) { int p=a%m;                      //closest multiple of m
		   		for(int i=a+p;i<=b;i+=m)
		   			System.out.print(i+" ");
		   }
		   else
		   {for(int i=a;i>=b;i--)
			   { if(i%m==0) System.out.print(i+" ");}
		   }
			         
	}

}
