import java.util.Arrays;


public class InsertionSort {
public void sort(Comparable[] a){
	for(int j=1;j<=a.length-1;j++){
		Comparable x=a[j];
		int i=j-1;
		while(i>=0&&a[i].compareTo(x)>0){
			a[i+1]=a[i];
			i--;
		}
		a[i+1]=x;
		
	}
}
public static void main(String[] args) {
	InsertionSort is=new InsertionSort();
	Integer[] a={3,7,4,9,5,2,6,1};
	is.sort(a);
	System.out.println(Arrays.toString(a));
}
}
