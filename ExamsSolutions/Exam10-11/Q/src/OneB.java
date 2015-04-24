import java.util.Arrays;

public class OneB {
 
     public static double[] movingAvg(double[] data, int len) {
         // ADD CODE HERE
    	 int n=data.length-len+1;
    	 double[] av=new double[n];
    	 for(int i=0;i<av.length;i++)
    	 {   double s=0;
    		 for(int j=i;j<i+len;j++)
    			 s+=data[j];
    		 av[i]=s/len;
    			
    	 }
    	 return av;
     }
     public static void main(String[] args) {
		double[] d={3,3,6,2,8,9};
		double[] res=movingAvg(d,3);
		for(double i:res)
			System.out.print(i+" ");
		
	}
 }
