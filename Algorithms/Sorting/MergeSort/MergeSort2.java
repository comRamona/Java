import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] a, int i, int j) {
		if (i < j) {
			int m = i + (j - i) / 2;
			sort(a, i, m);
			sort(a, m + 1, j);
			merge(a, i, m, j);
		}
	}

	public static void merge(int[] a, int i, int mid, int j) {
		int[] b = new int[j - i + 1];
		int k = i, l = mid + 1;
		int m = 0;
		while (k <= mid && l <= j) {
			if (a[k] < a[l])
				b[m++] = a[k++];
			else
				b[m++] = a[l++];
		}
		while (k <= mid)
			b[m++] = a[k++];
		while (l <= j)
			b[m++] = a[l++];
		for (m = 0; m <= j - i; m++)
			a[i + m] = b[m];
	}

	public static void main(String[] args) {
		int[] a = { 3, 7, 4, 9, 5, 2, 6, 1 };
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
