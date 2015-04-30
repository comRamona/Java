public abstract class Item {
 
     private int price;
     private String name;
     private boolean isLarge;
 
     public Item(int price) {
         this.price = price;
     }
 
     public Item() {
     }
 
     public boolean isLarge() {
         return isLarge;
     }
 
     public void setLarge(boolean isLarge) {
         this.isLarge = isLarge;
         if (isLarge) {
             price = price * 2;
         }
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String toString() {
         String size = "small";
         if (isLarge()) {
             size = "large";
         }
         String s = String.format("Item = %s, Size = %s, Price = %d", name,
                 size, price);
         return s;
     }
     
     public abstract void deliver();
 }
