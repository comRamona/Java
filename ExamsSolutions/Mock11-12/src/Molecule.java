import java.util.ArrayList;
import java.util.HashMap;

public class Molecule {
	private final HashMap<Element,Integer> mol=new HashMap<Element, Integer>();
	private final Table table=new Table();
    public void addAtom(String sym, int num){ mol.put(table.lookup(sym),num);}
    public void addAtom(String sym) { addAtom(sym,1); }
    public ArrayList<Element> atoms(){ ArrayList<Element> elms=new ArrayList<Element>();
    for(Element i:mol.keySet())
    	elms.add(i);
    return elms;
    }
    public double weight(){
    	double w=0;
    	for(Element i:atoms())
    		w+=i.getWeight()*mol.get(i);
    	return w;
    }
}
