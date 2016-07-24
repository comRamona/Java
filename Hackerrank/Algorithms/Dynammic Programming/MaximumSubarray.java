import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
                a[j]=sc.nextInt();
            int max=max(a);
            if(max<=0){
                System.out.println(max+" "+max);
            }
            else{
            int mc=maxContinuous(a);
            int mnc=maxNecontinuous(a);
            System.out.println(mc+" "+mnc);
        }
        }
        
        // -3 -1 -4
    }
    public static int maxContinuous(int[] a){
        int max=0;
        int maxSoFar=0;
        for(int i=0;i<a.length;i++){
            if(maxSoFar+a[i]>=0){
                maxSoFar=maxSoFar+a[i];
                
            }
            else {
                maxSoFar=0;
            }
             if(maxSoFar>max) max=maxSoFar;
        }
        return max;
    }
    public static int max(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        return max;
    }
    public static int maxNecontinuous(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0) max+=a[i];
        }
        return max;
    }
}
