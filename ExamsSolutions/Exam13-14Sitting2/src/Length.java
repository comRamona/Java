
public class Length {
	private int number;
	private String units;
	public Length() {number=0; units="km"; }
	public void setNumber(int number) {if(number>=0) this.number=number;}
	public int getNumber() {return number; }
	public String getUnits() { return units; }
	public void setUnits(String units){
		if(units.equals("km")||units.equals("miles")||units.equals("minutes"))
				this.units=units;
	}
	public void convert(String newUnits, double rate){
		if(newUnits.equals("km")||newUnits.equals("miles")||newUnits.equals("minutes"))
			{number=(int) Math.round((double)number/rate);
			 units=newUnits;
			}
		
	}
	public String toString() {return number+" "+units; }
	public static void main(String[] args) {
		Length x=new Length();
		x.setNumber(40);
		x.setUnits("km");
		x.convert("miles", 1.8);
		System.out.println(x);
		
	}

}
