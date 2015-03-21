
public class Element {
	 private final String element;
	 private final int atomicNum;
	 private final String sym;
	 private final double weight;
	 public Element(String element, int atomicNum,String sym, double weight){
		 this.element=element;
		 this.atomicNum=atomicNum;
		 this.sym=sym;
		 this.weight=weight;
		 
	 }
	 public String getElement(){ return element; }
	 public int getAtomicNum(){ return atomicNum; }
	 public String getSym(){ return sym; }
	 public double getWeight(){return weight;}
	 public String toString() {return "Element("+element+","+atomicNum+","+sym+","+weight+")";}
}
