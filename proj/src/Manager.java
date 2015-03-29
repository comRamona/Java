import java.util.ArrayList;


public class Manager extends Engineer {
	private ArrayList<Engineer> team;
	public Manager(String name, int salary) { super(name,salary); 
	team=new ArrayList<Engineer>();
	}
	public ArrayList<Engineer> getTeam() { return team; }
	public void setTeam(ArrayList<Engineer> team){
		this.team=team;
	}
	public String toString(){
		String s=this.getName()+"\nManages:";
		for(Engineer e:team)
			s=s+"\n"+e;
		return s;
		
	}
	public static void main(String[] args) {
		Manager Suzy=new Manager("Suzy",1000);
		ArrayList<Engineer> team=new ArrayList<Engineer>();
		Engineer Jo=new Engineer("Joe Bloggs",200);
		Engineer B=new Engineer("Sarah Bloggs",300);
		team.add(Jo);
		team.add(B);
		Suzy.setTeam(team);
		System.out.println(Suzy);
	}

}
