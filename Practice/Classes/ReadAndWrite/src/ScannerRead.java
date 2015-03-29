import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ScannerRead {
	

public static void copy(){
		Scanner in=null;
		PrintWriter out=null;
		try{ in=new Scanner(new BufferedReader(new FileReader("names2.txt")));
		out=new PrintWriter(new FileWriter("output2.txt"));
		String l;
		while(in.hasNext()) {l=in.next(); out.println(l); }
		System.out.println("done");
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		System.out.println(a.get(3));
		}
		catch(Exception e) {System.err.println(e.getMessage()); }
		finally {if(in!=null) in.close(); if(out!=null) out.close(); }
}
public static void main(String[] args) throws IOException {
	copy();
	Scanner s=new Scanner("names.txt");
	
}
}
