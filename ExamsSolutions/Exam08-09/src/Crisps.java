public class Crisps extends Item {
       
     public Crisps(int price) {
         super(price);
         setName("crisps");
     }
 	
      public void deliver() {
          String common = "package of crisps coming down the chute";
          if (isLarge()) {
              System.out.println("Large " + common);
          } else {
              System.out.println("Small + common");
          }
      }
 
 }
