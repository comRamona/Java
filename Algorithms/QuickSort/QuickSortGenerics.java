import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class QuickSortGenerics<T extends Comparable<T>> {
	public void qsort(T[] arr,int left, int right){
		int i=left,j=right;
		T pivot=arr[(left+right)/2];
		T aux;
		while(i<=j){
			while((arr[i]).compareTo(pivot)<0) i++;
			while((arr[j]).compareTo(pivot)>0) j--;
			if(i<=j) {
				aux=arr[i];
				arr[i]=arr[j];
				arr[j]=aux;
				i++;
				j--;
				
				
		}
		if(left<j) qsort(arr,left,j);
		if(right>i) qsort(arr,i,right);
		
		
	}
	}
	public static void main(String[] args) {
		Integer[] a={1,2,3,4,32,2,45,3,2};
		QuickSortGenerics<Integer> q=new QuickSortGenerics<Integer>();
		q.qsort(a, 0, a.length-1);
		for(Integer i:a)
			System.out.println(i);
	}

}
