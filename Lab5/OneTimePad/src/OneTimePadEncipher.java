public class OneTimePadEncipher {

    public static int charToInt(char l) {
      // ADD CODE HERE
      // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
    	if(Character.isUpperCase(l)) return ((int) l)-((int) 'A');
    	else return (int) l-(int) 'a';
    	
    }

    public static char intToChar(int i) {
      // ADD CODE HERE
      // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
      // it should always return lower case char
    	i=i%26;
    	return (char) (i+97);
    }

    public static boolean isAlpha(char c) {
      // You do not need to implement this method, but you may find it useful.
    	return Character.isAlphabetic(c);
    }

    public static String encipher(String original, String onetimepad) {
      // ADD CODE HERE
    	if(onetimepad.length()<original.length()) onetimepad.concat(original);
    	String encipherred=new String();
    	for(int i=0;i<original.length();i++)
    	{ char c=original.charAt(i);
    	  char d=onetimepad.charAt(i);
    	  if(c==' ') encipherred=encipherred+' ';
    	  if(isAlpha(c)&&isAlpha(d)) encipherred=encipherred+intToChar((charToInt(c)+charToInt(d)));
    	}
    	return encipherred;
    }


    public static void main(String[] args) {
      String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
      System.out.print(ciphertext);
    }

}