
public class PermNumbers {
    private int n;
    private int[] y;
    public PermNumbers(int n){
        this.n=n;
        y=new int[n+1];
        y[0]=1;
        perm(1);
    }
    public boolean cond(int k){
    	for(int i=1;i<k;i++)
    		if(y[k]==y[i]) return false;
    	return true;
    }
    public void perm(int k ){
        if(k>n){
         for(int i=1;i<=n;i++)
        	 System.out.print(y[i]+" ");
         System.out.println();
            
        }
        else {
        for( int i = 1; i <= n; i++){
        	y[k]=i;
            if(cond(k)) perm(k+1);
        } }
    }
public static void main(String[] args){
 int n=4;
 PermNumbers a=new PermNumbers(n);
}
}