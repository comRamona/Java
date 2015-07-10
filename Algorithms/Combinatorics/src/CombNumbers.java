import java.util.Arrays;

public class CombNumbers {
    private int[] x;
    private int[] y;
    private int n;
    private int len;
    public CombNumbers(int[] x, int n ){
        this.x=x;
        this.n=n;
        len=x.length;
        y=new int[len];
        combine(0,0);
    }
    public void combine(int k,int j ){
        if(k==n){
         for(int i=0;i<k;i++)
        	 System.out.print(y[i]+" ");
         System.out.println();
            return;
            
        }
        for( int i = j; i < len; i++){
        	y[k]=x[i];
        	 combine(k+1, i+1);
        }
    }
public static void main(String[] args){
 int[] x={3,6,8,2};
 CombNumbers a=new CombNumbers(x,3);
}
}