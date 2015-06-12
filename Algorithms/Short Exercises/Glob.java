import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Glob {
  public static String[] match(String pattern, String[] filenames) {

    ArrayList<String> s=new ArrayList<String>();
    pattern=pattern.replace("?", ".?");
    pattern=pattern.replace("*", ".*");
    Pattern p=Pattern.compile(pattern);
    for(String i:filenames)
    {  
    	Matcher m=p.matcher(i);
    	if(m.matches()) s.add(i);
    }
    String[] result=(String[]) s.toArray(new String[0]);
    return result;
  }

  public static boolean arrayEquals(String[] array1, String[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0;i < array1.length; i++) {
      if (!array1[i].equals(array2[i])) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(arrayEquals(new String[] { "abcd", "dabc", "abc" }, 
          match("?abc*", new String[] { "abcd", "dabc", "abc", "efabc", "eadd" })));
    System.out.println(arrayEquals(new String[] { "abcd", "dabc", "abc" }, 
          match("?a**c*", new String[] { "abcd", "dabc", "abc", "efabc", "eadd" })));
  }
}