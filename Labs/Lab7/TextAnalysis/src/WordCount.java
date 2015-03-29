
import java.util.HashMap;

public class WordCount {

public WordCounter(String[] tokens){ wordLengthFreq(tokens); }
   

public void wordLengthFreq(String[] tokens){}
    Replace the object’s frequency distribution with information about the lengths of the strings in tokens. 

public HashMap<Integer, Integer> getFreqDist()
    Returns the frequency distribution as a HashMap. 

public int maxVal()
    Returns the highest value in the frequency distribution.

public double[] map2array()
    Convert the frequency distribution to a normalized array of doubles. Each (integer) key of the frequency distribution corresponds to an index into the array, and the value for that key corresponds to the element at the index. Convert the values into percentages (where the maximum value of the distribution is 100%). 
}
