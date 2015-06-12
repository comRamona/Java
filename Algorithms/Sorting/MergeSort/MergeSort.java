import java.util.Arrays;


public class MergeSort {
	private Comparable[] a;
	private Comparable[] temp;
    public MergeSort(Comparable[] a){
    	this.a=a;
    	temp=new Comparable[a.length];
    	mergesort(0,a.length-1);
    	
    	
    }
	
	private void merge(int lo,int m,int hi){
		int i=lo,j=m+1;
		int k=lo;
		while(i<=m&&j<=hi){
			if(a[i].compareTo(a[j])<0) temp[k++]=a[i++];
			else temp[k++]=a[j++];
			
		}
		while(i<=m) temp[k++]=a[i++];
		while(j<=hi) temp[k++]=a[j++];
		
	    for(int t=lo;t<=hi;t++)
	    	a[t]=temp[t];
	    
		
		
	}
	private void mergesort(int lo,int hi){
		
		if(lo<hi)
		{int m=(lo+hi)/2;
		mergesort(lo,m);
		mergesort(m+1,hi);
		merge(lo,m,hi); }
		
	}
	public static void main(String[] args) {
		Integer[] m={22,44,51,18,1,11,13,7,100,2,4,5,56,71,8,12}; //use Integer so it is Comparable
		System.out.println(Arrays.toString(m)+"\n\nSorted:\n");
		MergeSort s=new MergeSort(m);
		System.out.println(Arrays.toString(m)+"\n");
		Integer[] p=m;
		Arrays.sort(p);
		boolean v=Arrays.equals(m, p);
		System.out.println(v);
	}
	
}
