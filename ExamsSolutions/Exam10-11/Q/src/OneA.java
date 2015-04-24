public class OneA {
 
     public static double harmonicMean(int[] nums) {
         // ADD CODE HERE
    	 int n=nums.length;
    	 double s=0;
    	 for(int i:nums)
    		 s+=(1.0)/i;
    	 return n/s;
     }
     public static void main(String[] args) {
		System.out.println(harmonicMean(new int[] {1,2,3}));
	}
 }
