//this programs reverses every word in a given string and leaves non-alphabetic characters in place

public class ReverseWords{
public static String reverse(String str){     
        String temp = "", result = "";
        for(int i=0;i<str.length();i++)
            if ( (Character.isAlphabetic(str.charAt(i))))
                temp = str.charAt(i) + temp;        //reverse word
            else {
                result += temp + str.charAt(i);      //punctuation mark, copy reversed word and start over to revert the next one
                temp = "";
            }

        result += temp;  //last word nneds to be copied
        System.out.println(result);
        return result;   
    }
   //this function reverses an entire String
  public static String reverse2(String str){     
    String temp = "";
    for(int i=0;i<str.length();i++)
            temp = str.charAt(i) + temp;        
  
    System.out.println(temp);
    return temp;
     
}
public static void main(String[] args){
	String s1=reverse("Hello World, hello nation!");
	String s2="olleH dlroW, olleh noitan!";  //expected output
	System.out.println(s1.equals(s2));  //check expected output and actual output match
}
}
