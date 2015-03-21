import java.util.HashMap;


public class ActivityHoliday extends Holiday {
private HashMap<String,Cost> activities;
public ActivityHoliday(String destination, int days){
	super(destination,days);
	activities=new HashMap<String,Cost>(10);
}
public void addActivity(String name,Cost cost){
	activities.put(name,cost);
}
public String toString(){
	String s=super.toString();
	s=s+"\nActivities:";
	for(String i:activities.keySet())
		s=s+"\n"+i+" "+activities.get(i);
	return s;
}
public static void main(String[] args) {
	ActivityHoliday one=new ActivityHoliday("Paris",12);
	Cost y=new Cost();
	y.setCurrency("euros");
	y.setAmount(5);
    one.addActivity("Museum",y);
    Cost x=new Cost();
    x.setCurrency("pounds sterling");
    x.setAmount(24);
    x.convert("euros", 1.3);
	one.addActivity("Clubbing",x);
	System.out.println(one);
}
}
