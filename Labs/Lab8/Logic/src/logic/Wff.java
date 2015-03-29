package logic;

public abstract class Wff {
	public abstract boolean eval(Valuation val);
	public abstract String toString();

}

/*

   			WFF
   	
 |						|
PropVar				BinaryWff
                     |     |
                   AndWff  OrWff
                   
                   
                   
*/