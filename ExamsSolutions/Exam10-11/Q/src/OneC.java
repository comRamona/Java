import java.util.ArrayList;

public class OneC {

	public static String[] getDomainLabels(String url) {
		if (url.contains("/"))
			return (url.substring(0, url.indexOf("/"))).split("\\.");
		else
			return url.split("\\.");
	}

	public static void reverseArray(String[] labels) {
		for(int i=0;i<labels.length/2;i++)
		{String s=labels[i];
		labels[i]=labels[labels.length-i-1];
		labels[labels.length-i-1]=s;
		}
	}

	public static String arrayToString(String[] labels) {
		String result="";
		for(String s:labels)
			result=result+s+".";
		return result.substring(0,result.length()-1);
	}

	public static ArrayList<String> textToReversedDomains(String filename) {
		// ADD CODE HERE
		ArrayList<String> res=new ArrayList<String>();
		StdIn.redirectInput(filename);
		while(!StdIn.isEmpty()){
			String line=StdIn.readLine();
			if(line.substring(0,4).equals("www."))
			{
				String [] dom=getDomainLabels(line);
				reverseArray(dom);
				res.add(arrayToString(dom));
			}
		}
			return res;
	}

	public static void main(String[] args) {
		ArrayList<String> bl=textToReversedDomains("spam.txt");
		System.out.println(bl);
		
	}
}
