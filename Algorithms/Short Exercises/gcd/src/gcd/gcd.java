package gcd;



public class gcd {

	public static void div(int x,int y){
		int r;
		while(y!=0){
			System.out.format("(gcd(%d,%d)%n",x,y);
			r=x%y;
			x=y;
			y=r;
		}
		System.out.println(x);
	
	}
	public static void main(String[] args) {
		div(9888,6060);
	}
}
