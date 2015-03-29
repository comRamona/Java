package logic;

public class PropLogicLauncher {

    public static void main(String[] args) {

       // Make some new constants
        PropVar p = new PropVar("P");
        PropVar q = new PropVar("Q");
        PropVar r = new PropVar("R");

        // Build some Wff
        Wff e1 = new AndWff(p, q);
        Wff e2 = new AndWff(e1, r);

        // What does their toString() method produce?
        
        System.out.println("Display form of Wff e1 is: " + e1);
        System.out.println("Display form of Wff e2 is: " + e2);
      
        System.out.println();

        // Create a Valuation and set some truth values
        Valuation val = new Valuation();
        val.put(p, true);
        val.put(q, true);
        val.put(r, false);

        // Compute the truth values and display the results
   
        System.out.println("The value of Wff e1 is: " + e1.eval(val));  //true
        System.out.println("The value of Wff e2 is: " + e2.eval(val));  //false
        
    }
}