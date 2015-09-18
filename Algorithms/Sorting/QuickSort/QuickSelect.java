//nth largest element

import java.util.Arrays;


public class QuickSort {

public void qsort(int[] a){
	sort(a,0,a.length-1,11);
}
public void sort(int[] a,int i,int j,int n){
	
	if(i<j){
	int p=partition(a,i,j);
	if(p>n) sort(a,i,p,n);
	else if(p<n) sort(a,p+1,j,n);
	else System.out.println(a[p]);
	}
}
public int partition(int[] a,int i, int j){

	int p=a[i];
    i--;
    j++;
	while(true){
		
		do{
			i++;
		}
		while(a[i]>p);

		do{
			j--;
		}
		while(a[j]<p);
		
		if(i<j) swap(a,i,j);
		else return j;
		
	}
	
	
}
public void swap(int[] a,int x,int y){
	int aux=a[x];
	a[x]=a[y];
	a[y]=aux;
}
public static void main(String[] args) {
	QuickSort qs=new QuickSort();
	int[] a={3,7,5,11,9,20,7,5,3,2,1,9,13,5,7,6,21,6,3,7,5,20};
	qs.qsort(a);
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}	
}

