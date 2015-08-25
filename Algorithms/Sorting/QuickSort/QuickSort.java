import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class QuickSort {
	public static void qsort(int[] arr,int left, int right){
		int i=left,j=right;
		int pivot=arr[(left+right)/2];
		int aux;
		while(i<=j){
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<=j) {
				/*System.out.println("i ="+i+" j="+j+" pivot= "+pivot+" a[i]= "+arr[i]+" a[j]= "+arr[j]);
				 * optional line to see what's happening during sorting
				 * */
				 
				aux=arr[i];
				arr[i]=arr[j];
				arr[j]=aux;
				i++;
				j--;
				/* See the matrix at every step
				 * for(int k:arr)
					System.out.print(k+" ");
				System.out.println(); */
			}
				
		}
		if(left<j) qsort(arr,left,j);  //array to sort has size bigger than 1
		if(right>i) qsort(arr,i,right);
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedWriter writer=new BufferedWriter(Files.newBufferedWriter(Paths.get("matrix.txt"),Charset.defaultCharset()));
		int n=10000;
		for(int i=1;i<=n;i++){
			int nr=1+(int)(Math.random()*(10000-1+1)); //generate random numbers between 1 and 10000
			writer.write(Integer.toString(nr));
			writer.write(" ");
		}
		writer.close();
		Scanner scan=new Scanner(Files.newBufferedReader(Paths.get("matrix.txt"),Charset.defaultCharset()));
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		scan.close();
		long x=System.currentTimeMillis();
		qsort(a,0,a.length-1);
		long y=System.currentTimeMillis();
		BufferedWriter writer2=new BufferedWriter(Files.newBufferedWriter(Paths.get("matrixSorted.txt"),Charset.defaultCharset()));
		for(int i:a)
		{
			writer2.write(i+" ");
			
		}
		writer2.close();
		System.out.println(y-x);  //time it takes to sort the matrix
	}

}
