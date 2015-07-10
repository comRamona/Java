
public class PermSome {
    private int n;
    private int[] y,x;
    public PermSome(int[] x){
        n=x.length;
        y=new int[n+1];
        this.x=x;
        perm(0);
    }
    public boolean cond(int k,int a){
    	for(int i=0;i<k;i++)
    		if(a==y[i]) return false;
    	return true;
    }
    public void perm(int k ){
        if(k==n){
         for(int i=0;i<n;i++)
        	 System.out.print(y[i]+" ");
         System.out.println();
            
        }
        else {
        for( int i = 0; i < n; i++){
        	y[k]=x[i];
            if(cond(k,x[i])) 
            	perm(k+1);
        } }
    }
public static void main(String[] args){
 int[] x={3,5,6};
 PermSome a=new PermSome(x);
}
}