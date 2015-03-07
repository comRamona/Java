class Circle {
	private int r;
	private int o;
	Circle(int r,int o) {this.r=r; this.o=o; }
	public void setR(int r) {this.r=r;}
	public void setO(int o) {this.o=o;}
	public int getR() {return r;}
	public int getO() {return o;}
	public void moveCircle(Circle circle,int deltaR,int deltaO) {circle.setR(circle.getR()+deltaR); circle.setR(circle.getR()+deltaR); 
	circle=new Circle(0,0); System.out.println(circle.getR()); }
	}

class obj { public int r=8; public int q=10; obj(int a,int b) {r=a; q=b;}}

public class ValuesAndRef {
      public static void foo(int[] b,int n) {b[0]=7; n=20;}
      public void fo(obj w) { w=new obj(100,5);}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		String s2="hello";
		String s3=s2.toUpperCase();
		System.out.println(s3+" "+s2);
		int []a={4,5};
		int n=5;
		foo(a,5);
		System.out.println(a[0]+" "+n);
		Circle rami=new Circle(2,5);
		System.out.println(rami.getR()+" "+rami.getO());
		rami.moveCircle(rami,3,4);
		System.out.println(rami.getR()+" "+rami.getO());
		obj test=new obj(2,3);
		ValuesAndRef p=new ValuesAndRef();
		p.fo(test);
		System.out.println(test.r);
	};

}
