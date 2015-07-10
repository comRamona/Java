package suf;

import java.util.Arrays;

public class HighestProd0f3 {
	
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        Arrays.sort(A);
	        int n=A.length-1;
	         int prod2=A[n]*A[n-1]*A[n-2];
	        if(A[0]<0&&A[1]<0) {int neg=A[0]*A[1];
	        int poz=A[n];
	        int prod1=neg*poz;
	        return (prod1>prod2) ? prod1:prod2; }
	        else { return prod2;}
	        
	    }
	}

