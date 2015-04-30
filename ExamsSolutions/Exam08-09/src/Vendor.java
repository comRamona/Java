public interface Vendor {
 
     void addStock(Item item);
     void selectItem(String name);
     void selectItem(String name, boolean isLarge);
     Item getCurrentChoice();
     void deliver();
 }
