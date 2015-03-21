import java.util.Arrays;
import java.util.HashMap;

public class QuestionOneTester {

	public static void main(String[] args) {
		// ADD CODE HERE
		System.out.println(OneA.geometricMean(new int[] { 1, 2, 3 }));
		System.out.println(OneB.longestSeq(new int[] { 1, 0, 0, 1, 1, 0, 0, 0,
				1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 1));
		System.out.println(OneC.findStringCounts("XXXX"));
		int[] a=new int[] {};
		char[]b={'a','b','c','d'};
		char[]c=new char[20];
		c=Arrays.copyOf(b, 2);
				System.out.println(new String(c));
		String text="numarul 12 si numarul 13";
		String[] words=text.split("\\D+");
		for(String i:words)
			System.out.println(i);

	}
}
