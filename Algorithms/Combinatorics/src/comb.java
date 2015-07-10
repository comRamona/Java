
public class comb {
    private int[] y;
    private int n;
    private int len;
    public comb(int m, int n ){
        this.n=n;
        len=m;
        y=new int[len];
        combine(0,1);
    }
    public void combine(int k,int j ){
        if(k==n){
         for(int i=0;i<k;i++)
        	 System.out.print(y[i]+" ");
         System.out.println();
            return;
            
        }
        for( int i = j; i < len; i++){
        	y[k]=i;
        	 combine(k+1, i+1);
        }
    }
public static void main(String[] args){
 comb a=new comb(5,3);
}
}