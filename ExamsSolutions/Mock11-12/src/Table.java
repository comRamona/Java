import java.util.ArrayList;

public class Table {
	private ArrayList<Element> table=new ArrayList<Element>();
	public Table(String fn) {
		readFile(fn);
	}

	public Table() {
		this("elements.csv");

	}

	public void readFile(String fn) {
		In file=new In(fn);
		while(!file.isEmpty())
		{String line=file.readLine();
		String[] elem=line.split(",");
		Element e=new Element(elem[0],Integer.parseInt(elem[1]),elem[2],Double.parseDouble(elem[3]));
		table.add(e);
		}

	}

	public Element lookup(String sym) {
		for(Element i:table)
			if(i.getSym().equals(sym)) return i;
		return null;
	}

	public void display() {
	for(Element i:table)
		System.out.println(i);

	}
	
}
