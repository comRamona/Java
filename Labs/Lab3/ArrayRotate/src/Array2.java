public class Array2 {
public static void main(String[] args){
int[] copy = new int[args.length];
int[] nums = new int[args.length];
for (int i = 0; i < nums.length; i++) {
nums[i]=Integer.parseInt(args[i]);
}
for(int i = 0; i< nums.length-1; i++ ) {
copy[i]=nums[i+1];
}
copy[copy.length-1]=nums[0];
for (int i = 0; i < copy.length; i++) {
System.out.print(copy[i]);
System.out.print(' ');
System.out.println("\n");
}
}
}