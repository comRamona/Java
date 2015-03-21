public class ChemistryKit {

 
    public static void main(String[] args) {
        
        String spacer = "\n----------------------------";
 
        /**
         * Create some elements and display them
         */     
        Element o = new Element("Oxygen", 8, "O", 16.00);
        Element c = new Element("Carbon", 6, "C", 12.01);        
        // Element(Carbon, 6, C, 12.01)
        System.out.println("Display carbon element:" + spacer + "\n" + c); 
        System.out.println();
                
        /**
         * Create a Table object and display it
         */   
        Table pt = new Table();
        System.out.println("Display a table of elements" + spacer);
        pt.display();        
        System.out.println();
        
        /**
         * Test looking up an element by symbol
         */          
        // Element(Nitrogen, 7, N, 14.01)
        System.out.println("Look up \"N\": " + pt.lookup("N")); 
        
        // null    
        System.out.println("Look up \"X\": " + pt.lookup("X")); 
        System.out.println();
        
        
        /**
         * Test adding atoms to a 'water' molecule
         */          
        Molecule water = new Molecule();
        water.addAtom("H", 2);
        water.addAtom("O");
        
        
        /**
         * Get info about the water molecule
         */          
        // [Element(Oxygen, 8, O, 16.0), Element(Hydrogen, 1, H, 1.01)]        
        System.out.println("Atoms in water: \n" + water.atoms()); 
        System.out.println();        
        System.out.println("Molecular weight of water: " + water.weight()); // 18.02 


    }

}
