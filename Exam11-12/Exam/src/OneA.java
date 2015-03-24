public class OneA {

    public static int prodOfPairs(int[] nums) {
        // ADD CODE HERE  
    	if(nums.length%2==1) return -1;
    	if(nums.length==0) return 0;
    	int n=nums.length;
    	int s=0;
    	for(int i=0;i<n-1;i+=2)
    		s+=nums[i]*nums[i+1];
    	return s;
    	
    }
    public static void main(String[] args) {
		System.out.println(prodOfPairs(new int[] {3,5,7,5,-2,4}));
         int[][] matrix={{12,1,4},{2,5,5}};
         System.out.println(matrix[0].length);
    
    }

 

}
