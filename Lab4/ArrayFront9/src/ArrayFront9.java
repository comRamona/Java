
public class ArrayFront9 {
	public static boolean arrayFront9(int[] nums){
		boolean is=false;
		for(int i=0;i<=3;i++)
			if(nums[i]==9) is=true;
		return is;
	}
	public static void main(String[] args) {
		 int N=args.length;
		 int[] nums=new int[N];
		 for(int i=0;i<N;i++) {
			  nums[i]=Integer.parseInt(args[i]);
		 }
		 System.out.println(arrayFront9(nums));
		 }
		
	}

