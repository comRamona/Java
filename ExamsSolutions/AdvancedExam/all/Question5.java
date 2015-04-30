import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Question5 {
	public static String stuff(String name) throws FileNotFoundException{
		Scanner scan=new Scanner(new FileReader(name));
		double val=0;
		int nr=0;
		while(scan.hasNext())	
		{  nr++;
			val+=scan.nextDouble();
		}
		scan.close();
		double average=val/nr;
		String s=String.format("There were %d records and the average data was %.2e to 2dp",nr,average);
		return s;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(stuff(args[0]));
	}

}

