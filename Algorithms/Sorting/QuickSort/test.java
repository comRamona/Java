import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test implements Runnable{
   Thread t;
   public test(){
	   t=new Thread(this);
   }
	public void run(){
		
		try{int nr=3;
		Scanner scan2=new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File("book.txt")))));
		String[] a=new String[nr];
		for(int i=0;i<nr;i++)
			a[i]=scan2.next();
		scan2.close();
		long x=System.currentTimeMillis();
		
		String[] b={"ana","are","multe","mere","asa","pere"};
		QuickSortWords.qsort(b,0,b.length-1);
		long y=System.currentTimeMillis();
        for(String i:b)
        	System.out.println(i);
        //      for(String i:a)
        //	System.out.println(i);
	//	System.out.println(y-x);  //time it takes to sort the matrix}
		}
		catch(Exception e){ }
	
}
	public static void main(String[] args) {
		long x=System.currentTimeMillis();
		Thread T=new Thread(new test());
	    T.start();
		try{ while(T.isAlive()){
			T.join(3000); //wait for a maximum of 9 seconds for it to finish
			T.interrupt();
			System.exit(0);
		}}
		catch(Exception e){ }
		
		
	}
}
