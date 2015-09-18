import java.util.Arrays;

public class ex3 {
	int[] arr;

	public ex3(int[] arr) {
		this.arr = arr;
	}

	public int nthLargest(int n) throws Exception {
		if (arr.length < n || n == 0) {
			throw new Exception("Choose a different number");
		} else {
			return select(arr, 0, arr.length - 1, n - 1);
		}
	}

	public int select(int[] arr, int lo, int hi, int n) {
		if (lo < hi) {
			int p = partition(arr, lo, hi);

			if (n < p)
				return select(arr, lo, p -1, n);
			else if (n > p)
				return select(arr, p + 1, hi, n);
			else
				return arr[p];

		}
		return arr[lo];
	}

	public int partition(int[] a,int i, int j){
	    //Hoare partitioning
		int p=a[i];
	     //prepare for entering the do while loop
	    j++;
       //leave pivot at lo until the final swap
	    int left=i,right=j;
	    int lo=i;
		while(true){
			//see comments at the end
			do{
				i++;
			//this time we need stopping conditions
				if(i==right) break;
			}
			while(a[i]>p);
		
			do{
				j--;
				if(j==left) break;
			}
			while(a[j]<p);
		
			if(i<j) swap(a,i,j);
			else {swap(a,j,lo);return j; }
			
		}
		
		
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) throws Exception {
		int[] arr = {5,3,2,6,4,1,3,7};
		//1 2 3 3 4 5 6 7
		ex3 test = new ex3(arr);
		int n = test.nthLargest(4);
		System.out.println(n);
		int[] ar2r = { 5, 3, 9, 4, 3, 3, 8, 3, 3 };
		// 1 2 5 6 8 9 12 32 34 67
		ex3 test2 = new ex3(ar2r);
		n = test2.nthLargest(1);
		System.out.println(n);
		n = test2.nthLargest(4);
		System.out.println(n);
		int[] arr3 = { 2,3,3,5 };
		
		ex3 test3 = new ex3(arr3);
		n = test3.nthLargest(3);
		System.out.println(n);
		int[] a=new int[10000];
		for(int i=0;i<10000;i++)
			a[i]=0;
		a[200]=67;
		ex3 test4 = new ex3(arr);
		n = test4.nthLargest(1);
		System.out.println(n);
	}
}

