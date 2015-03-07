
public class Sieve {
public static void main(String[] args){ 
	int[] all;
    int n=StdIn.readInt();
	all=new int[n-1];
	for(int i=0;i<n-1;i++)
		all[i]=i+2;
	 int p=2,i=0;
	 int count=1;
	while(p<n) {
		 System.out.print(p+" "); count++;
		if(count%10==0) System.out.print("\r");
		for(i=p*p-2;i<n-1;i+=p)
			all[i]=0; 
		boolean w=true;
		for(i=p-2;i<n-1&&w;i++)
			if(all[i]>p) {w=false; p=all[i];}
		if(w) p=n; 
			
	} 
}
}
