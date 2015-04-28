import java.util.Arrays;


public class OneB {
   public int[] copyRange(int[] a,int i, int j){
	   int[] b=new int[a.length];
	   for(int k=0;k<a.length;k++)
		   b[k]=-1;
	   /*for(int k=i;k<=j;k++)
		   b[k]=a[k]; */
	   System.arraycopy(a,i,b,i,j-i+1);
	   return b;
	   
   }
   public static void main(String[] args) {
	
	int[] a={2,6,5,7,4,1,3};
	OneB test=new OneB();
	int[] b=test.copyRange(a,2,4);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));

}
}
