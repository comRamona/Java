
public class randoms {
	private final intwr i;
public randoms(intwr i) {this.i=i;}
public void p() {System.out.println(i);
}
public static void main(String[] args) {
	final intwr i=new intwr();
	final randoms r=new randoms(i);
	i.set(7); //it changes the values in randoms as well! cool
	i.set(8); //or not! sthwap
	r.p();
}
}
