
public class MountainBike { private String name;
public MountainBike() { name="Sarah"; }
public String toString() {return name;}
public static void main(String[] args) {
	MountainBike bi=new MountainBike();
	Object obj=bi;
	Object pi=new String("hei");
	// not bi=obj;
	boolean q=obj instanceof MountainBike; //true
	MountainBike m=(MountainBike) obj;  //casting
	System.out.println(q);
}
}
