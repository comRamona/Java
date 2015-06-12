import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;




public class QuickSortWords {
	public static void qsort(String[] arr,int left, int right){
		int i=left,j=right;
		String pivot=arr[(left+right)/2];
		String aux;
		while(i<=j){
			while(arr[i].compareToIgnoreCase(pivot)<0) i++;
			while(arr[j].compareToIgnoreCase(pivot)>0) j--;
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
	
		try{int nr=400;
		Scanner scan2=new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File("book.txt")))));
		String[] a=new String[nr];
		for(int i=0;i<nr;i++)
			a[i]=scan2.next();
		scan2.close();
		long x=System.currentTimeMillis();
		
		qsort(a,0,a.length-1);
		long y=System.currentTimeMillis();
		BufferedWriter w=new  BufferedWriter(Files.newBufferedWriter(Paths.get("booksorted.txt"), Charset.defaultCharset()));
	    for(String i:a)
	    	w.write(i+" ");
	    w.close();
		System.out.println(y-x);  //time it takes to sort the matrix}
		}
		catch(Exception e){System.out.println("err"); }
	}
}

