
public class Mode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []count=new int[10];
		int [] dataset=new int[args.length];
		for(int i=0;i<args.length;i++)
			dataset[i]=Integer.parseInt(args[i]);
		for(int i=0;i<args.length;i++)
			count[dataset[i]]++;
	   for(int i=0;i<=9;i++)
	   { System.out.print("["+i+"s: "+count[i]+"]");
	    if(count[i]!=0) System.out.print(" ");
	    for(int j=1;j<=count[i];j++) System.out.print(".");
	    System.out.println();
	   }
	   int max=count[0];
	   int mode=dataset[0];
	   for(int i=1;i<9;i++)
		   if(count[i]>max) {max=count[i]; mode=i;}
	   System.out.println("Mode: "+mode);

	}

}
