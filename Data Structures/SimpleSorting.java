import java.util.ArrayList;
import java.util.Arrays;

public class SimpleSorting {

	public static void insertionSort(int[] a){
		//find each element's place
		int n=a.length;
		for(int i=1;i<n;i++){
			int el=a[i];
			int j=i-1;
			while(j>=0&&a[j]>el){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=el;
		}
	}
	
	public static void maxSort(int[] a){
		int n=a.length;
		for(int i=n-1;i>=0;i--){
			int m=0;
			for(int j=0;j<=i;j++){
				if(a[j]>a[m]) m=j;
			//swap
			int aux=a[m];
			a[m]=a[i];
			a[i]=aux;
			}
		}
	}
	
	public static void maxSortHeap(Integer[] a) throws Exception{
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(a));
		BinaryHeap heap=new BinaryHeap(arr);
		for(int i=arr.size()-1;i>=0;i--){
			a[i]=heap.removeMax();
		}
		
	}
	public static void main(String[] args) {
		int[] a={1,4,87,2,3,14,21,78,110,-4,3,12};
		insertionSort(a);
		for(Integer i:a)
			System.out.print(i+" ");
		int[] b={1,4,87,2,3,14,21,78,110,-4,3,12};
		System.out.println();
		maxSort(b);
		for(Integer i:b)
			System.out.print(i+" ");
		Integer[] c={1,4,87,2,3,14,21,78,110,-4,3,12};
		System.out.println();
		try {
			maxSortHeap(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Integer i:c)
			System.out.print(i+" ");
	}
}
