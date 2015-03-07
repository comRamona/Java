
import java.util.HashMap;

public class WordCounter {

private HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();

	
public WordCounter(String[] tokens){ wordLengthFreq(tokens); }
   

public void wordLengthFreq(String[] tokens){
	freq.clear();
	for(int i=0;i<tokens.length;i++)
	{ int l=tokens[i].length();
	  if(freq.get(l)==null) freq.put(l,1); else {int g=freq.get(l); freq.put(l, g+1); }
	}
		
}
  // (length,frequency) : (2,10), (3,175), (5,49)

public HashMap<Integer, Integer> getFreqDist()
{ return freq; }

public int maxVal()
{   int maxf=0;
	for(int i:freq.values())
	   if(maxf<i) maxf=i;                 //max frequency
	return maxf;
	
}

public double[] map2array(){
	if(freq.size()==0) return new double [] {};
	int maxl=0;
	for(int i:freq.keySet())              //max length
		if(maxl<i) maxl=i;
	double[] a=new double[maxl+1];
	for(int i=0;i<a.length;i++)
		if(!freq.containsKey(i)) a[i]=0;      //or freq.get(i)==null
		else { int maxf=maxVal(); a[i]=((double) freq.get(i))/maxf*100; }
		
	return a;
}
  public static void main(String[] args) {
	  Tokenizer tokenizer = new Tokenizer("austen-emma.txt");
	  String[] tokens = tokenizer.getTokens();

	  WordCounter wordCounter = new WordCounter(tokens);
	  System.out.println(wordCounter.getFreqDist());
	  double[] points = wordCounter.map2array();
	  int n = points.length;
	  StdDraw.clear();
	  StdDraw.setXscale(0, n - 1);
	  StdDraw.setYscale(0, 100);
	  StdDraw.setPenRadius(0.5 / n);
	  for (int i = 0; i < n; i++) {
	      StdDraw.line(i, 0, i, points[i]);
	  }
} 
}
