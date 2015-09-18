import java.util.Arrays;


public class QuickSort {

public void qsort(int[] a){
	sort(a,0,a.length-1);
}
public void sort(int[] a,int i,int j){
	for(int k=i;k<=j;k++)
		System.out.print(a[k]+" ");
	System.out.println();
	if(i<j){
	int p=partition(a,i,j);
    //returned value is i<=p<j
	sort(a,i,p);
	sort(a,p+1,j);
	}
}
public int partition(int[] a,int i, int j){

	int p=a[i];
    i--; //prepare for entering the do while loop
    j++;
	while(true){
		//see comments at the end
		do{
			i++;
		}
		while(a[i]<p);
	
		do{
			j--;
		}
		while(a[j]>p);
	
		if(i<j) swap(a,i,j);
		else return j;
//pivot is not in its right place
/*
The magic explanation for stopping:
if all are in order, i will stop at p and j will also reach p

*/	
	}
	
	
}
public void swap(int[] a,int x,int y){
	int aux=a[x];
	a[x]=a[y];
	a[y]=aux;
}
public static void main(String[] args) {
	QuickSort qs=new QuickSort();
	int[] a={3,3,3,7,3,3,1,3,3,7};
	qs.qsort(a);
	System.out.println(Arrays.toString(a));
}	
}


/*
We need to use do-while instead of while because after swapping we need to enter the loops again.
An alternative would be to use while and when swapping advance with i++ and j--.
This is the Hoarse partitioning.
Quicksort is a divide and conquer style algorithm, with most work being done in the divide(partition) part.
It has a very bad worst case running time (O(n^2)), because there is no way to make sure we divide in parts close in size.
Thus, we may end up with all the elements in a single side, reducing the complexity of the problle by only one at a step.
Worst case scenario appears when all elements are already sorted.
This might be tackled by choosing the pivot at random.
The pivot does not end

*/
