
public class Subsets {
    private int[] x;
    private int[] y;
    private int len;
    public Subsets(int[] x){
        this.x=x;
        len=x.length;
        y=new int[len];
        combine(0,0);
    }
    public void combine(int k,int j ){
        {
         for(int i=0;i<k;i++)
        	 System.out.print(y[i]+" ");
         System.out.println();
            
            
        }
        for( int i = j; i < len; i++){
        	y[k]=x[i];
        	 combine(k+1, i+1);
        }
    }
public static void main(String[] args){
 int[] x={1,2,3,4};
 Subsets a=new Subsets(x);
}
}