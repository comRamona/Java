public class VendingMachineLauncher {
 
     public static void main(String[] args) {
 
         // Declare a 'meaningful' argument to fill the
         // second parameter of selectItem()
         boolean isLarge = true;
 
         VendingMachine vm = new VendingMachine();
 
         // Create a few goodies
         Crisps crisps = new Crisps(90);
         Tea tea1 = new Tea(99);
         Tea tea2 = new Tea(99);
 
         // Stock up the machine
         vm.addStock(crisps);
         vm.addStock(tea1);
         vm.addStock(tea2);
 
         // Run the machine
         // A large package of crisps
         vm.selectItem("crisps", isLarge);
         System.out.println("Current choice: " + vm.getCurrentChoice());
         vm.deliver();
 
         // A small cup of tea
         System.out.println();
         vm.selectItem("tea");
         System.out.println("Current choice " + vm.getCurrentChoice());
         vm.deliver();
 
         // A large cup of tea
         System.out.println();
         vm.selectItem("tea", isLarge);
         System.out.println("Current choice " + vm.getCurrentChoice());
         vm.deliver();
 
         // Try to get some more crisps!
         System.out.println();
         vm.selectItem("crisps", isLarge);
         System.out.println("Current choice: " + vm.getCurrentChoice());
         vm.deliver();
         

 
         // The expected output of this code is the following:
 
         // Current choice: Item = crisps, Size = large, Price = 180
         // Large package of crisps coming down the chute
         //
         // Current choice Item = tea, Size = small, Price = 99
         // Pouring into a small cup
         //
         // Current choice Item = tea, Size = large, Price = 198
         // Pouring into a large cup
         //
         // Current choice: null
         // Sorry, out of stock!
 
     }
 }
