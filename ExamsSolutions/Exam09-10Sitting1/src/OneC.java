import java.util.Arrays;


public class OneC {
public int[] remove(int[] a,int b){
	int n=0;
	for(int i:a)
		if(i==b) n++;
	int[] c=new int[a.length-n];
	int j=0;
	for(int i=0;i<a.length;i++)
		if(a[i]!=b) {c[j]=a[i]; j++;}
	return c;
	
}
public static void main(String[] args) {
	OneC test=new OneC();
	int[] a={3,4,5,6,7,5,3,2,5,0,1};
	int[] b=test.remove(a, 5);
	System.out.println(Arrays.toString(b));
}
}
