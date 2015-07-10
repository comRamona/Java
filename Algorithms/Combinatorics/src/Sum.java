import java.util.Scanner;

/*	write m in all possible ways as sum of p numbers from {1,2,..,n}
 * ex: n=10, p=3, m=7
 *  1 1 5
 *  1 2 4
 *  1 3 3
 */ 

public class Sum {
 
    private int n, m, p;
    private int[] x;
    public Sum(int n, int p, int m){
    	this.n=n;
    	this.p=p;
    	this.m=m;
    	x=new int[p+1];
    	x[0]=1;
    	back(1);
    	
    }
    public void back(int k){
    	if(k>p) { show(); return; }
    	for(int i=x[k-1];i<=n;i++){
    		x[k]=i;
    		if(cond(k)) back(k+1);
    	}
    	
    }
    
    public boolean cond(int k){
    	int s=sum(k);
    	if(s>m) return false;
    	if(k==p&&s!=m) return false;
    	return true;
    }
    
    public int sum(int k){
    	int s=0;
    	for(int i=1;i<=k;i++)
    		s+=x[i];
    	return s;
    }
    
    public void show(){
    	for(int i=1;i<=p;i++)
    		System.out.print(x[i]+" ");
    	System.out.println();
    }
    
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	int p=s.nextInt();
    	int m=s.nextInt();
    	s.close();
    	Sum sum=new Sum(n,p,m);
    }
}
    