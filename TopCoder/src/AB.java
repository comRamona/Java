import java.util.Arrays;
//SRM 648 Div1 250
public class AB{
    public String createString(int N,int K){
   StringBuilder sb=new StringBuilder(N);
		for (int i = 0; i < N; i++)
			sb.append('B'); 
		if (K > (N * N) / 4)
			return "";
		if (K == 0)
		{
			return sb.toString();
			}
		int nrA = 1;
		while (nrA <= N / 2) {
			int max = (N - nrA) * nrA;
			if(K <= max) {
				int pos = 0;
				for (int p = 0; p <= N - nrA; p++)
					if (K == ((N - nrA - p) * nrA)) {
						pos = p;
						for (int j = pos; j < pos+nrA; j++)
							sb.setCharAt(j,'A');
						return sb.toString();
					}
			}
			nrA++;
		}
		return "";

	}
	
	public static void main(String[] args) {
		long x1=System.currentTimeMillis();
		String s = new AB().createString(40, 100);
		long x2=(System.currentTimeMillis());
		System.out.println(x2-x1);
		System.out.println(s);
	
	}
    
}

/*
You are given two s: N and K. Lun the dog is interested in strings that satisfy the following conditions:

The string has exactly N characters, each of which is either 'A' or 'B'.
The string s has exactly K pairs (i, j) (0 <= i < j <= N-1) such that s[i] = 'A' and s[j] = 'B'.
If there exists a string that satisfies the conditions, find and return any such string. Otherwise, return an empty string.
*/
