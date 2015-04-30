public class Tea extends Item {
       
     public Tea(int price) {
         super(price);
         setName("tea");
     }
 	
      public void deliver() {
          if (isLarge()) {
              System.out.println("Pouring into a large cup");
          } else {
              System.out.println("Pouring into a small cup");
          }
      }
 
 }
