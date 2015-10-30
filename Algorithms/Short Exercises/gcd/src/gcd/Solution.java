package gcd;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger a=BigInteger.valueOf(sc.nextInt());
        BigInteger b=BigInteger.valueOf(sc.nextInt());
        int N=sc.nextInt();
        int i=2;
        BigInteger c=b;
        while(i!=N){
            c=(b.multiply(b)).add(a);
            a=b;
            b=c;
            i++;
        }
        System.out.println(c);
        sc.close();
    }
}