import java.util.Arrays;


public class Rearrangement {
	public static int dotWith(int[] a,int[] b){
		if(a.length!=b.length) return 0;
		int d=0;
		for(int i=0;i<a.length;i++)
			d+=a[i]*b[i];
		return d;
		
	}
	public static void rotate(int[] b) {
		for(int i=b.length-1;i>0;i--)
		{int temp=b[i];
		   b[i]=b[i-1];
		   b[i-1]=temp;
		}

	}
	public static int useRotations(int[] a,int[] b){
		if(a.length!=b.length) return 0;
		int n=a.length;
		int s=dotWith(a,b),max=s;
	   for(int i=1;i<n;i++)
	   { rotate(b); s=dotWith(a,b); if(max<s) max=s; }
	   return s;
		
	}
	public static int useSorted(int[] a,int[] b){
		if(a.length!=b.length) return 0;
		Arrays.sort(a);
		Arrays.sort(b);
		return dotWith(a,b);
	}
	public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    int[] a=new int[n];
    int[] b=new int[n];
    int j=1;
    for(int i=0;i<n;i++)
    a[i]=Integer.parseInt(args[j++]);
    for(int i=0;i<n;i++)
        b[i]=Integer.parseInt(args[j++]);
    System.out.println("dotWith gave: "+dotWith(a,b));
    System.out.println("useRotations gave: "+useRotations(a,b));
    System.out.println("useSorted gave: "+useSorted(a,b));  
	}
	

}
