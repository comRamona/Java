import java.util.Arrays;


public class InsertionSort {

	public static void isort(Comparable[] a){
		for(int i=0;i<a.length-1;i++)
			for(int j=i;j<a.length;j++)
				if(a[i].compareTo(a[j])>0){
					Comparable tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
		
	}
	public static void main(String[] args) {
		int n=20;
		Integer[] a=new Integer[20];
		for(int i=0;i<n;i++)
			a[i]=1+(int)(Math.random()*(100));
		System.out.println(Arrays.toString(a));
		Integer[] b=Arrays.copyOf(a,a.length);
		isort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));
		
	}
	
	
}
