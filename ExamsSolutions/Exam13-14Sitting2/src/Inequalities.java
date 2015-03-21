
public class Inequalities {
	public static int dotProduct(int[] a,int[] b){
		if(a.length!=b.length) return 0;
		int d=0;
		for(int i=0;i<a.length;i++)
			d+=a[i]*b[i];
		return d;
		
	}
	public static int[] concatenate(int[] a,int[] b) {
		int[] result=new int[a.length+b.length];
		System.arraycopy(a,0,result,0, a.length);
		System.arraycopy(b,0,result,a.length, b.length);
		return result;
	}
	public static boolean cs(int[] a,int[] b){
		int lhs=(int) Math.pow(dotProduct(a,b),2);
		int rhs=dotProduct(a,a)*dotProduct(b,b);
		return lhs<=rhs;
		
	}
	public static boolean amgm(int[] a){
		int p=1,s=0;
		for(int i:a)
		{p*=i; s+=i;}
		double am=(double)p/a.length;
		double gm=Math.pow(p,1.0/a.length);
		return am>=gm;
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int j=1;
		int[] a=new int[n],b=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(args[j++]);
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(args[j++]);
		System.out.println("CS held: "+cs(a,b));
		System.out.println("AMGM held: "+amgm(concatenate(a,b)));
		
	}
}
