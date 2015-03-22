
public class Engineer {
private int salary;
private String name;
public Engineer(String name, int salary){
	this.name=name;
	this.salary=salary;
}
public String getName(){ return name; }
public int getSalary() { return salary; }
public void setName(String name){this.name=name;}
public void setSalary(int salary){this.salary=salary;}
public String toString() { return name+"("+salary+")"; }
public static void main(String[] args) {
	Engineer Jo=new Engineer("Joe Bloggs",1500);
	System.out.println(Jo);
}
}
