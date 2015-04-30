import java.util.ArrayList;


public class VendingMachine implements Vendor{
private Item currentChoice;
private ArrayList<Item> stock=new ArrayList<Item>();
public void addStock(Item item){
	stock.add(item);
}
public Item getCurrentChoice(){
	return currentChoice;
}

public void selectItem(String name){    //name=tea or crisps
	boolean w=false;
	for(Item i:stock)
		if(i.getName().equals(name)) { currentChoice=i;	w=true; break;}
	if(!w) currentChoice=null;
}
public void selectItem(String name, boolean isLarge){
	selectItem(name);
	if(currentChoice!=null) currentChoice.setLarge(isLarge);
}
public void deliver(){
	if(currentChoice==null) System.out.println("Sorry, out of stock!");
	else { currentChoice.deliver(); stock.remove(currentChoice); currentChoice=null; }
}
}
