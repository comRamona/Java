import java.util.HashMap;


public class GymSession extends ExerciseSession {
	private HashMap<String,Length> machines;
	public GymSession(String type, String place){
		super(type,place);
		machines=new HashMap<String,Length>(8);
	}
	public void addMachine(String name,Length length){
		machines.put(name, length);
		
	}
	public String toString(){
		String s=super.toString();
		s=s+"\nMachines:";
		for(String i:machines.keySet())
			s=s+"\n"+i+" "+machines.get(i);
		return s;
		
	}
	public static void main(String[] args) {
		Length x=new Length();
		x.setNumber(5);
		x.setUnits("km");
		GymSession one=new GymSession("Gym","The Pleasance");
		one.addMachine("Treadmill", x);
		Length y=new Length();
		y.setNumber(3);
		one.addMachine("Stepper",y);
		System.out.println(one);
	}

}
