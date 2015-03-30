import java.util.ArrayList;


public class OneC {

	public static int hammingDist(String left, String right){
		
		int n=left.length();
		int nr=0;
		for(int i=0;i<n;i++)
			if(left.charAt(i)!=right.charAt(i)) nr++;
		return nr;
		
	}
	public static String findFarthest(String s,String[] targets){
		int dist=0;
		String far="";
		for(String i:targets)
			if(hammingDist(s,i)>dist) {dist=hammingDist(s,i); far=i; }
		return far;
			}
		
	public static ArrayList<String> findNearest(String s, String[] targets, int k){
			ArrayList<String> res=new ArrayList<String>();
			for(String i:targets)
				if(hammingDist(s,i)<=k) res.add(i);
			return res;
		
	}
	
	public static int stringDist(String left,String right){
		int l=left.length();
		int r=right.length();
		String big=""; String small="";
		if(l>r) {big=left; small=right; }
		else {big=right; small=left; }
		int t=Math.abs(l-r);
		big=big.substring(0,small.length());
		int nr=hammingDist(small,big);
		nr+=t;
		return nr;
		
	}
	
	public static void main(String[] args) {
		System.out.println(hammingDist("abaca","apaca"));
		String[] t={"abaca","aback","abaft","adapt"};
		System.out.println(findFarthest("abaca",t));
		System.out.println(findNearest("abaca",t,2).toString());
		System.out.println(stringDist("heat","heater"));
	}
	
}
