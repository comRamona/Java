import java.util.Arrays;


public class BubbleSort {

	public static void bsort(Comparable[] a){
		boolean sw=true;
		Comparable tmp;
		int j=0;
		while(sw){
			sw=false;
			j++;
			for(int i=0;i<a.length-j;i++){
				if(a[i].compareTo(a[i+1])>0){
					tmp=a[i];
					a[i]=a[i+1];
					a[i+1]=tmp;
					sw=true;
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		int n=20;
		Integer[] a=new Integer[20];
		for(int i=0;i<n;i++)
			a[i]=1+(int)(Math.random()*(100));
		System.out.println(Arrays.toString(a));
		Integer[] b=Arrays.copyOf(a,a.length);
		bsort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));
		
	}
	
}
