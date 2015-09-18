
public class LomutoPartition {
	int[] arr;

	public LomutoPartition(int[] arr) {
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

	private int partition(int[] arr, int lo, int hi) {
		int p = arr[hi];
		int i = lo;
		
		for(int j=lo;j<=hi-1;j++)
			if(arr[j]<=p){
				swap(arr,i,j);
				i++;
			}
		swap(arr,i,hi);
		return i;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) throws Exception {
		int[] arr = {5,3,2,6,4,1,3,7};
		//1 2 3 3 4 5 6 7
		// 1 2 5 6 8 9 12 32 34 67
		LomutoPartition test = new LomutoPartition(arr);
		int n = test.nthLargest(4);
		System.out.println(n);
		int[] ar2r = { 5, 3, 9, 4, 3, 3, 8, 3, 3 };
		// 1 2 5 6 8 9 12 32 34 67
		LomutoPartition test2 = new LomutoPartition(ar2r);
		n = test2.nthLargest(1);
		System.out.println(n);
		n = test2.nthLargest(4);
		System.out.println(n);
		int[] arr3 = { 2,3,3,5 };
		
		LomutoPartition test3 = new LomutoPartition(arr3);
		n = test3.nthLargest(3);
		System.out.println(n);
		int[] a=new int[10000];
		for(int i=0;i<10000;i++)
			a[i]=0;
		a[200]=67;
		LomutoPartition test4 = new LomutoPartition(arr);
		n = test4.nthLargest(1);
		System.out.println(n);
	}
}
