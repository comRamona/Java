
public class ArrayRotate {
	public static void main(String[] args) {
		int n=StdIn.readInt();
		int[] nums;
		nums=new int[n];
		for(int i=0;i<n;i++)
			nums[i]=StdIn.readInt();
		int[] copy=new int[n];
		for(int i=0;i<n;i++)            //rotate by 1
			copy[i]=nums[(i+1)%n];
		for(int i=0;i<n;i++)
			StdOut.print(copy[i]+" ");
		StdOut.println();
		StdOut.print("direct rotate: "+'\n'); //rotate by any number
		int temp;
		StdOut.print("by: "+'\n');
		int m=StdIn.readInt();
		for(int i=0;i<n-m;i+=1)
				{ temp=nums[i];
				  nums[i]=nums[i+m];
				  nums[i+m]=temp;
				}
		for(int i=0;i<n;i++)
			StdOut.print(nums[i]+" ");
			
			
		StdOut.close();
		
	}

}
