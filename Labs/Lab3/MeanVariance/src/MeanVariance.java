
public class MeanVariance {
	public static void main(String[] args) {
		double ma=0;
		for(int i=0;i<args.length;i++)
			ma+=Double.parseDouble(args[i]);
		ma/=args.length;
		double mv=0;
		for(int i=0;i<args.length;i++)
			mv+=Math.pow(Double.parseDouble(args[i])-ma,2);
		mv/=args.length;
		System.out.println(ma+"\n"+mv);
			
	}

}
